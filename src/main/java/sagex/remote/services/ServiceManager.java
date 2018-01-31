package sagex.remote.services;

import javax.script.*;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by seans on 24/02/16.
 */
public class ServiceManager {
    private ScriptEngineManager manager = new ScriptEngineManager();

    static class Service {
        File file;
        long lastModified;
        ScriptEngine engine;
        CompiledScript script;

        public Object eval(HttpServletRequest req) throws IOException, ScriptException {
            if (file.lastModified()>lastModified) {
                script=null;
            }
            if (script==null && engine instanceof Compilable) {
                try (FileReader reader = new FileReader(file)) {
                    script = ((Compilable) engine).compile(reader);
                }
            }
            if (script!=null) {
                return script.eval(newBindings(req));
            } else {
                try (FileReader reader = new FileReader(file)) {
                    return engine.eval(reader, newBindings(req));
                }
            }
        }

        private Bindings newBindings(HttpServletRequest req) {
            Bindings bindings = engine.createBindings();
            bindings.put("request", req);
            return bindings;
        }
    }

    Map<String, Service> services = new HashMap<>();

    public Object eval(File serviceFile, HttpServletRequest req) throws Exception {
        Service service = services.get(serviceFile.getAbsolutePath());
        if (service==null) {
            System.out.println("Recompiling Script: " + serviceFile.getAbsolutePath());
            service = new Service();
            service.file =serviceFile;
            service.lastModified = serviceFile.lastModified();
            service.engine = manager.getEngineByName("JavaScript");
            addGlobals(service.engine, serviceFile);
            services.put(serviceFile.getAbsolutePath(), service);
        }
        return service.eval(req);
    }

    public Object eval(String serviceScript, HttpServletRequest req) throws Exception {
        System.out.println("Recompiling Script: " + serviceScript);
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        addGlobals(engine, new File("./script.js"));
        return engine.eval(serviceScript);
    }


    private void addGlobals(ScriptEngine engine, File script) {
        Bindings b = engine.getBindings(ScriptContext.GLOBAL_SCOPE);
        b.put("script_dir", script.getParentFile().getAbsolutePath());
        b.put("console", new Console());
    }
}
