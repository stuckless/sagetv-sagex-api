package sagex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sagex.api.Global;
import sagex.util.ILog;
import sagex.util.LogProvider;

public final class UIContext {
    private static final ILog                              log                          = LogProvider.getLogger(UIContext.class);
    private static final Pattern                           threadPattern                = Pattern.compile("-([0-9a-f]{12}+)@", Pattern.CASE_INSENSITIVE);
    public static final String                             SAGETV_PROCESS_LOCAL_UI_NAME = "SAGETV_PROCESS_LOCAL_UI";
    public static final UIContext                          SAGETV_PROCESS_LOCAL_UI      = new UIContext(SAGETV_PROCESS_LOCAL_UI_NAME);

    private static final InheritableThreadLocal<UIContext> currentContext               = new InheritableThreadLocal<UIContext>();

    private String                                         context                      = null;

    public UIContext(String name) {
        this.context = name;
    }

    public String getName() {
        return context;
    }

    public String toString() {
        return getName();
    }

    public static UIContext getCurrentContext() {
        UIContext ui = currentContext.get();
        if (ui == null) {
            // test if sage has it fixed...
            String ctx = Global.GetUIContextName();

            // sage is still broken, so lets figure it out
            if (ctx == null) {
                // still no context, try the thread parse hack
                if (ctx == null) {
                    String name = Thread.currentThread().getName();
                    log.debug("Attempting to parse UIContext from thread name: " + name);
                    // try to parse the context from the thread
                    Matcher m = threadPattern.matcher(name);
                    if (m.find()) {
                        ctx = m.group(1);
                    } else {
                        // not found...
                        if (name.contains(SAGETV_PROCESS_LOCAL_UI_NAME)) {
                            ctx = SAGETV_PROCESS_LOCAL_UI_NAME;
                        }
                    }
                }
            }
            
            if (ctx != null) {
                log.debug("Discovered UIContext: " + ctx);
                ui = new UIContext(ctx);
                setCurrentContext(ui);
            } else {
                String names[] = Global.GetUIContextNames();
                if (names != null && names.length==1) {
                    log.debug("Auto Selecting the only context in use: " + names[0]);
                    ui = new UIContext(names[0]);
                    setCurrentContext(ui);
                }
            }
            
            if (ui==null) {
                log.debug("No Context was found!");
            }
        }
        
        return ui;
    }

    public static void setCurrentContext(UIContext context2) {
        currentContext.set(context2);
    }
}
