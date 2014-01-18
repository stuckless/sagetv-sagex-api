package test;

import sagex.SageAPI;
import sagex.api.AiringAPI;
import sagex.stub.StubSageAPI;

public class TestStubAPI {
    public static void main(String args[]) {
        SageAPI.setProvider(new StubSageAPI());
        AiringAPI.IsAiringObject(null);
    }
}
