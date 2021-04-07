package net.sw4t.glowsquid.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicated that an element has been automatically generated.
 * <i>Generated</i> elements should not be modified by hand, and changes
 *   should instead be made by re-generation using the means specified in {@code by()}.
 */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface Generated {
    /**
     * The name of the program or other entity that generated the annotated element.
     */
    String by() default "";
}
