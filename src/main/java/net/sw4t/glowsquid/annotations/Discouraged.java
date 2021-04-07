package net.sw4t.glowsquid.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Indicates that usage of the annotated element is <i>discouraged</i>,
 * for the reason specified in {@code value()}. This is slightly weaker than {@code Deprecated}, and
 * does not indicate an intent by the author to remove the annotated element.
 *
 * A <i>discouraged</i> field should not be read or written to.
 * A <i>discouraged</i> method should not be invoked.
 * A <i>discouraged</i> class should not be instantiated, and all fields and methods of the class should be treated
 *   as also being <i>discouraged</i>.
 */
@Retention(RetentionPolicy.SOURCE)
public @interface Discouraged {
    String value();
}
