package utils;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @overview
 *  Annotate a method or constructor as a domain operation.
 *
 * @version 2017
 */
@Documented
@Retention(RUNTIME)
@Target({METHOD, CONSTRUCTOR})
public @interface DOpt {

    /**
     *  The operation type
     */
    OptType type();

    /**
     *  whether or not the behaviour of the associated operation is optional for the
     *  owner class to function.
     *  <br>Default: <tt>false</tt>
     */
    boolean optional() default false;

}
