package sagex.plugin;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = java.lang.annotation.ElementType.METHOD)
public @interface ConfigValueChangeHandler {
    public String value();
}
