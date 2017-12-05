package hu.unideb.fitbase.commons.path.pass;

/**
 * URIs for passes.
 */
public class PassPath {

    public static final String PARAM_GYM_ID = "gymId";

    public static final String PARAM_PASS_ID = "passId";

    public static final String GYM_ID = "/{" + PARAM_GYM_ID + "}";

    public static final String PASS_ID = "/{" + PARAM_PASS_ID + "}";

    public static final String PASS_CREATE_SUITBALE = "/passes/create/suitable";

    public static final String PASS_CREATE_TIME_LIMITED = "/passes/create/time/limited";

    public static final String PASS_UPDATE_SUITBALE = "/passes/update/suitable";

    public static final String PASS_update_TIME_LIMITED = "/passes/update/time/limited";

    /**
     * URI for pass list by gym.
     */
    public static final String PASSES_LIST_BY_GYM_URL = "/passes";

    /**
     * URI for pass delete.
     */
    public static final String PASS_DELETE_URL = "/passes/delete";

    private PassPath() {
    }
}
