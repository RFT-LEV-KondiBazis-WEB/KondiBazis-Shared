package hu.unideb.fitbase.commons.constants.rules.registration.password;

public final class PasswordRuleConstants {

    public static final String FIELD = "password";

    public static final String LENGTH_RULE = "password_should_be_at_least_6_character_long";

    public static final String CHARACTER_RULE = "password_should_contain_at_least_one_character";

    public static final String UPPER_CASE_RULE = "password_should_contain_at_least_one_upper_case_character";

    public static final String DIGIT_RULE = "password_should_contain_at_least_one_digit";

    public static final String BLANK_RULE = "password_field_is_required";

    public static final String CONFIRMATION_RULE = "confirmation_password_should_be_the_same_as_password";

    private PasswordRuleConstants() {
    }
}
