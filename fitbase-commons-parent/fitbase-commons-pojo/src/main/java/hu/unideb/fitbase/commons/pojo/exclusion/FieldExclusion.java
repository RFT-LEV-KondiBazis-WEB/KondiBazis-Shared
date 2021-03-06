package hu.unideb.fitbase.commons.pojo.exclusion;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Field exclusion provider.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class FieldExclusion {

    /**
     * Exclude password.
     */
    public static final String EXCLUDE_PASSWORD = "password";
}