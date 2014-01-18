package sagex.remote.jetty;

import org.mortbay.jetty.security.Constraint;
import org.mortbay.jetty.security.ConstraintMapping;
import org.mortbay.jetty.security.SecurityHandler;
import org.mortbay.jetty.servlet.Context;

import sagex.plugin.impl.SagexConfiguration;
import sagex.remote.SagexServlet;

public class JettyInitializer {
	public static void initJetty(org.mortbay.jetty.servlet.Context ctx) {
		SagexServlet.getUserData().put("jetty_context", ctx);
		updateAuthentication();
	}

	public static void updateAuthentication() {
		try {
			SagexConfiguration config = new SagexConfiguration();

			boolean httpenabled = config.getBoolean(SagexConfiguration.PROP_ENABLE_HTTP, true);
			Context ctx = (Context) SagexServlet.getUserData().get("jetty_context");
			if (!httpenabled) {
				System.out.println("SAGEX-API: Stopping Http Context");
				ctx.stop();
				return;
			} else {
				if (ctx.isStopped()) {
					System.out.println("SAGEX-API: Starting Http Context");
					ctx.start();
				}
			}
			
			if (ctx == null) {
				System.out
						.println("SAGEX-API: Can't configure authentication; No Jetty Context.");
				return;
			}
			SecurityHandler sh = ctx.getSecurityHandler();
			if (sh == null) {
				System.out
						.println("SAGEX-API: Can't configure authentication; No Security Handler.");
				return;
			}
			ConstraintMapping cmap[] = sh.getConstraintMappings();
			if (cmap == null) {
				System.out
						.println("SAGEX-API: Can't configure authentication; No Constraints.");
				return;
			}

			boolean auth = config.getBoolean(
					SagexConfiguration.PROP_SECURE_HTTP, true);
			for (ConstraintMapping c : cmap) {
				Constraint cs = c.getConstraint();
				if (cs != null) {
					System.out
							.println("SAGEX-API: Updated Constrant Authentication: "
									+ auth);
					cs.setAuthenticate(auth);
				}
			}
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
