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
         * Price column.
         */
        public static final String COLUMN_NAME_PRICE = "price";

        /**
         * Pass type column.
         */
        public static final String COLUMN_NAME_PASS_TYPE = "pass_type";

        /**
         * Duration column.
         */
        public static final String COLUMN_NAME_DURATION = "duration";

        /**
         * Time duration column.
         */
        public static final String COLUMN_NAME_TIME_DURATION = "time_duration";

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

        public static final String COLUMN_NAME_CUSTOMER_HISTORY_ID = "customer_history_id";

        public static final String COLUMN_NAME_STARTDATE = "start_date";

        public static final String COLUMN_NAME_ENDDATE = "end_date";

        public static final String COLUMN_NAME_PASS_BUYDATE = "pass_buy_date";

        public static final String COLUMN_NAME_PASS_STATUS = "pass_status";

        public static final String COLUMN_NAME_PASS_NAME = "pass_name";

        public static final String COLUMN_NAME_PASS_TYPE = "pass_type";

        public static final String COLUMN_NAME_PASS_PRICE = "pass_price";

        public static final String COLUMN_NAME_PASS_ALL_DURATION = "pass_all_duration";

        public static final String COLUMN_NAME_PASS_LEFT_DURATION = "users_pass_left_duration";
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class ReferencedColumName{

        public static final String REFERENCED_COLUM_NAME_ID = "id";

    }


}
