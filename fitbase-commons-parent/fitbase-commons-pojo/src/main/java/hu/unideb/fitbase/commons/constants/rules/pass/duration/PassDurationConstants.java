package hu.unideb.fitbase.commons.constants.rules.pass.duration;

public class PassDurationConstants {

    public static final String FIELD = "pass_duration";

    public static final String VALIDATION_MESSAGE = "valid_email_required";

    public static final String BLANK_RULE = "email_field_required";

    public static final String UNIQUE_RULE = "this_email_have_been_reserved_earlier";

    public static final String DURATION_FORMAT_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private PassDurationConstants() {
    }

}
