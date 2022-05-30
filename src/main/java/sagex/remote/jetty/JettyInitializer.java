package sagex.remote.jetty;

import org.eclipse.jetty.webapp.WebAppContext;
import sagex.plugin.impl.SagexConfiguration;
import sagex.remote.SagexServlet;

public class JettyInitializer {
	public static void initJetty(WebAppContext ctx) {
		SagexServlet.getUserData().put("jetty_context", ctx);
		updateAuthentication();
	}

	public static void updateAuthentication() {
		try {
			SagexConfiguration config = new SagexConfiguration();

			boolean httpenabled = config.getBoolean(SagexConfiguration.PROP_ENABLE_HTTP, true);
			WebAppContext ctx = (WebAppContext) SagexServlet.getUserData().get("jetty_context");
			if (!httpenabled) {
				ctx.stop();
				return;
			} else {
				if (ctx.isShutdown()) {
					ctx.start();
				}
			}
			
			if (ctx == null) {
				System.out.println("SAGEX-API: updateAuthentication Can't configure authentication; No Jetty Context.");
				return;
			}

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
