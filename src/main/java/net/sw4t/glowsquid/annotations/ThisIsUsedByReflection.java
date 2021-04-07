package net.sw4t.glowsquid.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Indicates an element that is only accessed by means of Java reflection.
 * Elements with this annotation should not be considered safe to removed based only on
 *   emission of an unused warning.
 */
@Retention(RetentionPolicy.SOURCE)
public @interface ThisIsUsedByReflection {
    @SuppressWarnings("unused")
    String see();
}
