package hu.unideb.fitbase.commons.path.gym;

/**
 * URIs for gyms manager create.
 */
public class ManagerPath {

    public static final String PARAM_GYM_ID = "gymId";

    public static final String GYM_ID = "/{" + PARAM_GYM_ID + "}";

    /**
     * URI for gyms manager create.
     */
    public static final String GYM_MANAGER_CREATE_URL = "/gyms/manager/create";

    /**
     * URI for gyms manager create.
     */
    public static final String GYM_MANAGER_UPDATE_URL = "/gyms/manager/update";

    private ManagerPath() {
    }
}
