package hu.unideb.fitbase.commons.constants.rules.registration.email;

public final class EmailRuleConstants {

    public static final String FIELD = "email";

    public static final String VALIDATION_MESSAGE = "valid_email_required";

    public static final String BLANK_RULE = "email_field_required";

    public static final String UNIQUE_RULE = "this_email_have_been_reserved_earlier";

    public static final String EMAIL_FORMAT_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private EmailRuleConstants() {
    }

}
