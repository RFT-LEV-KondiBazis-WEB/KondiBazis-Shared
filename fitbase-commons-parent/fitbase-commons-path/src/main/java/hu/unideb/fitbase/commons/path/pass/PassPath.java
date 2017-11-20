package hu.unideb.fitbase.commons.path.pass;

/**
 * URIs for passes.
 */
public class PassPath {

    /**
     * URI for pass create.
     */
    public static final String PASS_CREATE_URL = "/passes/create";

    public static final String PASSES_LIST_BY_GYM_URL = "/passes";

    /**
     * URI for pass update.
     */
    public static final String PASS_MODIFICATION_URL = "/passes/update";

    public static final String PARAM_PASS_ID = "passId";

    public static final String PASS_DELETE_URL = "/passes/delete/{" + PARAM_PASS_ID + "}";

    private PassPath() {
    }
}
