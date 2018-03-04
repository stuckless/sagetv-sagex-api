package sagex.remote.api;

import sagex.SageAPI;
import sagex.remote.xmlrpc.RequestHelper;
import sagex.util.ILog;
import sagex.util.IOUtil;
import sagex.util.LogProvider;
import sagex.util.SystemUtil;

import javax.script.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceFactory {
    private static class ServicePackage {
        private String name;
        private File file;
        private ScriptEngine engine;
        private long lastModified;
    }
    
    private ILog log = LogProvider.getLogger(ServiceFactory.class);
    
    private File serviceDir=null;
    private ScriptEngineManager manager = new ScriptEngineManager();
    
    private Map<String, ServicePackage> servicePackages = null;

    public ServiceFactory(File serviceDir) {
        this.serviceDir = serviceDir;
        servicePackages = new HashMap<String, ServicePackage>();
    }

    public ServiceFactory() {
        this(new File("sagex/services/"));
    }
    
    public Object callService(String context, String packageName, String serviceName, String[] args) throws Exception {
        ServicePackage sp = servicePackages.get(packageName);
        if (sp==null) {
            sp = new ServicePackage();
            sp.name=packageName;
            sp.engine = manager.getEngineByName("JavaScript");
            addGlobals(sp.engine);
            sp.file = new File(serviceDir, packageName + ".js");
            if (!sp.file.exists()) {
                throw new RuntimeException("Invalid Service Package: " + packageName + "; Missing Service File: " + sp.file.getAbsolutePath());
            }
            servicePackages.put(packageName, sp);
        }
        
        if (sp.file.lastModified() > sp.lastModified) {
            FileReader fr = null;
            try {
                fr = new FileReader(sp.file);
                sp.engine.eval(fr);
            } finally {
                fr.close();
            }
            sp.lastModified = sp.file.lastModified();
        }
        
        List l = new ArrayList();
        if (context!=null) {
            SageAPI.setUIContext(context);
        }
        
        if (args!=null) {
            for (String arg: args) {
                Object o = RequestHelper.makeSageObject(arg);
                if (o!=null) {
                    l.add(o);
                } else {
                    l.add(arg);
                }
            }
        }
        
        Invocable inv = (Invocable) sp.engine;
        return inv.invokeFunction(serviceName, l.toArray());
    }

    private void addGlobals(ScriptEngine engine) {
        Bindings b = engine.getBindings(ScriptContext.ENGINE_SCOPE);

        if (SystemUtil.isJava8OrGreater()) {
            // java 8 or later
            try {
                addScript(engine, IOUtil.urlToString(this.getClass().getClassLoader().getResource("sagex-compat.js")));
            } catch (ScriptException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            b.put("MediaFileAPI", new sagex.api.MediaFileAPI());
            b.put("Global", new sagex.api.Global());
            b.put("Utility", new sagex.api.Utility());
            b.put("PlaylistAPI", new sagex.api.PlaylistAPI());
            b.put("AiringAPI", new sagex.api.AiringAPI());
            b.put("AlbumAPI", new sagex.api.AlbumAPI());
            b.put("CaptureDeviceAPI", new sagex.api.CaptureDeviceAPI());
            b.put("CaptureDeviceInputAPI", new sagex.api.CaptureDeviceInputAPI());
            b.put("ChannelAPI", new sagex.api.ChannelAPI());
            b.put("Configuration", new sagex.api.Configuration());
            b.put("Database", new sagex.api.Database());
            b.put("FavoriteAPI", new sagex.api.FavoriteAPI());
            b.put("MediaPlayerAPI", new sagex.api.MediaPlayerAPI());
            b.put("SeriesInfoAPI", new sagex.api.SeriesInfoAPI());
            b.put("ShowAPI", new sagex.api.ShowAPI());
            b.put("TranscodeAPI", new sagex.api.TranscodeAPI());
            b.put("TVEditorialAPI", new sagex.api.TVEditorialAPI());
            b.put("WidgetAPI", new sagex.api.WidgetAPI());
            b.put("Version", new sagex.api.Version());
            b.put("SageAPI", new sagex.SageAPI());
            b.put("Log", log);
        }
    }

    public void addScript(ScriptEngine engine, String script) throws ScriptException {
        engine.eval(script);
    }
}
