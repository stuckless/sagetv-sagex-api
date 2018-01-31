package sagex.remote.services;

/**
 * Created by seans on 24/02/16.
 */
public class Console {
    public void log(Object... msg) {
        StringBuilder sb = new StringBuilder();
        for (Object o: msg) {
            sb.append(o).append(" ");
        }
        System.out.println(sb.toString());
    }

    public void debug(Object... msg) {
        log(msg);
    }

    public void info(Object... msg) {
        log(msg);
    }

    public void warn(Object... msg) {
        log(msg);
    }

    public void error(Object... msg) {
        log(msg);
    }
}
