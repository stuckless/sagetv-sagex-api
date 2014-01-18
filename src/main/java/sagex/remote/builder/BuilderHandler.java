package sagex.remote.builder;

public interface BuilderHandler {
    void beginObject(String objectName);
    void endObject(String objectName);
    void handleError(String string, Exception e) throws Exception;
    void handleField(String name, Object data);
    void beginArray(String name, int size);
    void endArray(String name);
}
