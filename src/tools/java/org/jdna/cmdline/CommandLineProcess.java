package org.jdna.cmdline;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An Annotation for a Class to inidicate that it is a CommandLine annotated
 * object. Should be used with CommandLineArg annotation.
 * 
 * @author seans
 * 
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = java.lang.annotation.ElementType.TYPE)
public @interface CommandLineProcess {
    public String description();

    public boolean acceptExtraArgs() default true;
}
