package test.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import sagex.ISageAPIProvider;
import sagex.SageAPI;
import sagex.UIContext;
import sagex.api.Global;


public class TestUICalls {
    public String context = null;
    
    @Test
    public void testUICalls() {
        // stub provider that only sets the context
        ISageAPIProvider provider = new ISageAPIProvider() {
            public Object callService(String name, Object[] args) throws Exception {
                return null;
            }

            public Object callService(String context, String name, Object[] args) throws Exception {
                TestUICalls.this.context = context;
                return null;
            }
        };
        
        SageAPI.setProvider(provider);
        String clients[] = Global.GetConnectedClients();
        assertNull(context);
        
        clients = Global.GetConnectedClients(null);
        assertNull(context);
        
        UIContext ctx = UIContext.SAGETV_PROCESS_LOCAL_UI;
        clients = Global.GetConnectedClients(ctx);
        assertEquals(context, ctx.getName());

        // calls to NON UI calls should not request the UI context
        context=null;
        clients = Global.GetConnectedClients();
        assertNull(context);
     
        // calls to NON UI calls should NOT attempt to fetch the thread local context
        SageAPI.setUIContext(ctx);
        clients = Global.GetConnectedClients();
        assertNull(context);
        
        // passing a null as the context will force it lookup a context
        clients = Global.GetConnectedClients(null);
        assertEquals(context, ctx.getName());

        SageAPI.setUIContext(null);
        context=null;
        clients = Global.GetConnectedClients();
        assertNull(context);
        
        clients = Global.GetConnectedClients(null);
        assertNull(context);
    }
}
