package net.sw4t.glowsquid.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface Discouraged {
    @SuppressWarnings("unused") String value();
}
