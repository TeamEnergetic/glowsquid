package net.sw4t.glowsquid.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Denotes a class that can be converted to a <a href="https://openjdk.java.net/jeps/169">value object</a> when value object are available.
 * <p>
 * A value object must be immutable with final fields and no other internal state.
 * <p>
 * Currently, the {@link Object#hashCode} and {@link Object#equals(Object)} must be well-defined and include every field.
 * </p>
 *
 * <p>
 * Value objects are part of <a href="https://openjdk.java.net/projects/valhalla/">Project Valhalla</a>, and will be available in a future Java release.
 * </p>
 */
@FutureJDK(value = "Project Valhalla - Value Object", jep = "https://openjdk.java.net/jeps/169")
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ValueObject {
}
