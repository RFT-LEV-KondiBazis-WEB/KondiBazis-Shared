package hu.unideb.fitbase.commons.path.pass;

/**
 * URIs for passes.
 */
public class PassPath {

    public static final String PARAM_GYM_ID = "gymId";

    public static final String GYM_ID = "/{" + PARAM_GYM_ID + "}";

    /**
     * URI for Manager pass create.
     */
    public static final String PASS_MANAGER_CREATE_URL = "/passes/manager/create";

    /**
     * URI for Admin pass create.
     */
    public static final String PASS_ADMIN_CREATE_URL = "/passes/admin/create";

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
