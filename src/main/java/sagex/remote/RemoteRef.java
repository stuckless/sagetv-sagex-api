package sagex.remote;

import java.io.Serializable;

public class RemoteRef implements Serializable {
    private final String type;

    private final String id;

    public RemoteRef(String type, String id) {
        this.type=type;
        this.id=id;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RemoteRef{");
        sb.append("type='").append(type).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
