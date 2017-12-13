package hu.unideb.fitbase.commons.pojo.table;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Table name provider.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TableName {

    /**
     * User table.
     */
    public static final String TABLE_NAME_USER = "user";

    /**
     * Gym table
     */
    public static final String TABLE_NAME_GYM = "gym";

    /**
     * Pass table
     */
    public static final String TABLE_NAME_PASS = "pass";

    /**
     * Customer table
     */
    public static final String TABLE_NAME_CUSTOMER = "customer";

    /**
     * Customer history table
     */
    public static final String TABLE_NAME_CUSTOMER_HISTORY = "customerhistory";

    /**
     * User has gym table.
     */
    public static final String TABLE_NAME_USER_HAS_GYM = "user_has_gym";

    public static final String TABLE_NAME_CUSTOMER_HAS_PASS = "customer_has_pass";

    public static final String TABLE_NAME_GYM_HAS_PASS = "gym_has_pass";
}