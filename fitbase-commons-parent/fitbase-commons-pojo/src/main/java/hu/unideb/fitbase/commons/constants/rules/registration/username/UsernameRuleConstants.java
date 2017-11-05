package hu.unideb.fitbase.commons.constants.rules.registration.username;

public final class UsernameRuleConstants {

    public static final String FIELD = "username";

    public static final String BLANK_RULE = "username_field_is_required";

    public static final String LENGTH_RULE = "username_should_be_at_least_4_character_long";

    public static final String UNIQUE_RULE = "this_username_have_been_reserved_earlier";

    private UsernameRuleConstants() {
    }
}
