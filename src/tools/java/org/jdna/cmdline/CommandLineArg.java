package org.jdna.cmdline;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation that can be placed on a method of an object to indicate that it
 * can received a named command line arg.
 * 
 * Annotated objects can be processed by the CommandLine object to generate help
 * pages and to automatically fill objects from the commandline.
 * 
 * @author seans
 * 
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = java.lang.annotation.ElementType.METHOD)
public @interface CommandLineArg {
    public String description();

    public boolean required() default false;

    public String name();
}
