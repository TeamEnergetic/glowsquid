package net.sw4t.glowsquid.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE_PARAMETER, ElementType.PARAMETER, ElementType.FIELD})
public @interface Recommended {
    String value();
}
