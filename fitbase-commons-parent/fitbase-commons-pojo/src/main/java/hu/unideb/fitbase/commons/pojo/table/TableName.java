package hu.unideb.fitbase.commons.pojo.table;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Table name provider.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TableName {

    /**
     * Data table.
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
     * Data has gym table.
     */
    public static final String TABLE_NAME_USER_HAS_GYM = "user_has_gym";

    /**
     * Users role table.
     */
    public static final String TABLE_NAME_USER_AUTHORITY = "users_authority";
}