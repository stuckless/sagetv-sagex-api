package sagex.util;

import java.io.Serializable;

/**
 * Object to hold the sagetv object type and it's primary key.
 *
 */
public class RemoteRef implements Serializable {
    private final String type;

    private final String id;

    /**
     * Create a Reference using the given type and id
     *
     * @param type one of airing,album,channel,favorite,mediafile,playlist,plugin,series,systemmessage,userrecord,widget
     * @param id primary object id for the type
     */
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
