package sagex.plugin;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 
 * @author seans
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = java.lang.annotation.ElementType.METHOD)
public @interface SageEvent {
	/**
	 * The sage event to handle
	 * 
	 * @return
	 */
    public String value();
    
    /**
     * if true, then the event will be handled by a background task
     *  
     * @return
     */
    public boolean background() default false;
}
