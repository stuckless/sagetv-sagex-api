package sagex.remote.builder;

import org.junit.Test;
import sagex.SageAPI;
import sagex.stub.StubSageAPI;
import sagex.util.LogProvider;

import static org.junit.Assert.*;

/**
 * Created by seans on 17/08/16.
 */
public class SageAPIBuilderTest {
    @Test
    public void build() throws Exception {
        LogProvider.useSystemOut();
        StubSageAPI api = new StubSageAPI();
        api.addCall("GetOS","TESTOS");
        SageAPI.setProvider(api);

        BuilderHandler handler = new BuilderHandler() {
            @Override
            public void beginObject(String objectName) {
                System.out.println("BEGIN: " + objectName);
            }

            @Override
            public void endObject(String objectName) {
                System.out.println("  END: " + objectName);
            }

            @Override
            public void handleError(String string, Exception e) throws Exception {
                System.out.println("ERROR: " + string);
                e.printStackTrace();
            }

            @Override
            public void handleField(String name, Object data) {
                System.out.println("   FIELD: " + name);
            }

            @Override
            public void beginArray(String name, int size) {
                System.out.println("BEGIN ARRAY: " + name);
            }

            @Override
            public void endArray(String name) {
                System.out.println("  END ARRAY: " + name);
            }
        };

        SageAPIBuilder builder = SageAPIBuilder.INSTANCE;
        builder.build("Test",null, handler, false, null);
    }
}