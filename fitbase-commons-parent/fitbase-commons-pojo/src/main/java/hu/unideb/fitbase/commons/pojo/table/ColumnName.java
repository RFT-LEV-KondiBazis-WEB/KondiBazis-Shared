package hu.unideb.fitbase.commons.pojo.table;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Column name provider.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ColumnName {

    /**
     * User column name.
     */
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class UserColumName {

        /**
         * ID column.
         */
        public static final String COLUMN_NAME_USER_ID = "user_id";

        /**
         * Username column.
         */
        public static final String COLUMN_NAME_USERNAME ="username";

        /**
         * Email column.
         */
        public static final String COLUMN_NAME_EMAIL = "email";

        /**
         * Password column.
         */
        public static final String COLUMN_NAME_PASSWORD = "password";

        /**
         * First name column.
         */
        public static final String COLUMN_NAME_FIRST_NAME = "first_name";

        /**
         * Last name column.
         */
        public static final String COLUMN_NAME_LAST_NAME = "last_name";

        /**
         * Remember token column.
         */
        public static final String COLUMN_NAME_REMEMBER_TOKEN = "remember_token";

        /**
         * Create date column.
         */
        public static final String COLUMN_NAME_CREATED_DATE = "created_date";

        /**
         * Role column.
         */
        public static final String COLUMN_NAME_ROLE = "role";

    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class GymColumName {

        /**
         * Gym id column.
         */
        public static final String COLUMN_NAME_GYM_ID = "gym_id";

        /**
         * Name column.
         */
        public static final String COLUMN_NAME_GYM_NAME = "name";

        /**
         * City name column.
         */
        public static final String COLUMN_NAME_GYM_CITY = "city";

        /**
         * Address column.
         */
        public static final String COLUMN_NAME_GYM_ADDRESS = "address";

        /**
         * Zip code column.
         */
        public static final String COLUMN_NAME_GYM_ZIPCODE = "zipcode";

        /**
         * Description column.
         */
        public static final String COLUMN_NAME_GYM_DESCRIPTION = "desciption";

        /**
         * Opening hours column.
         */
        public static final String COLUMN_NAME_GYM_OPENINGHOURS = "opening_hours";

    }

    /**
     * Pass table column
     */
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class PassColumName {

        public static final String COULMN_NAME_PASS_ID = "pass_id";

        /**
         * Name column.
         */
        public static final String COLUMN_NAME_NAME = "name";

        /**
         * Limited column.
         */
        public static final String COLUMN_NAME_IS_LIMITED = "is_limited";

        /**
         * Limit number column.
         */
        public static final String COLUMN_NAME_LIMIT = "limit_number";

        /**
         * Duration column.
         */
        public static final String COLUMN_NAME_DURATION = "duration";

        /**
         * Price column.
         */
        public static final String COLUMN_NAME_PRICE = "price";

        /**
         * Available column.
         */
        public static final String COLUMN_NAME_AVAILABLE = "available";
    }

    /**
     * Customer table column.
     */
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class CustomerColumName {

        /**
         * Customer id column.
         */
        public static final String COLUMN_NAME_CUSTOMER_ID = "customer_id";

        /**
         * Email column.
         */
        public static final String COLUMN_NAME_EMAIL = "emial";

        /**
         * First name column.
         */
        public static final String COLUMN_NAME_FIRST_NAME = "first_name";

        /**
         * Last name column.
         */
        public static final String COLUMN_NAME_LAST_NAME = "last_name";

        /**
         * Phone number column.
         */
        public static final String COLUMN_NAME_PHONE_NUMBER = "phone_number";

        /**
         * Birthday date column.
         */
        public static final String COLUMN_NAME_BIRTHDAY_DATE = "birthday_date";

        /**
         * Gender column.
         */
        public static final String COLUMN_NAME_GENDER = "gender";
    }

    /**
     * Customer history table column.
     */
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class CustomerHistoryColumnName{

        public static final String COLUMN_NAME_STARTDATE = "start_date";

        public static final String COLUMN_NAME_ENDDATE = "end_date";

    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class ReferencedColumName{

        public static final String REFERENCED_COLUM_NAME_ID = "id";

    }


}
