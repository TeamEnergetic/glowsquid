package net.sw4t.glowsquid.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Denotes a class that can be modified when a future JDK is release.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
@Repeatable(FutureJDK.FutureJDKArray.class)
public @interface FutureJDK {
    /**
     * @return the pre-requisite JDK version/feature
     */
    String value() default "";

    /**
     * @return the url to the JEP (JDK Enhancement Proposal) (if applicable)
     */
    String jep() default "";

    /**
     * @return the comment indicating what action should be taken when available
     */
    String comment() default "";

    @Target({ElementType.TYPE, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @interface FutureJDKArray {
        FutureJDK[] value();
    }
}
