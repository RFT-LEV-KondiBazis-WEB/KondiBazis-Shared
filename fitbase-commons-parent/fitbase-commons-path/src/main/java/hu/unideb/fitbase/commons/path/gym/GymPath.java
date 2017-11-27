package hu.unideb.fitbase.commons.path.gym;

/**
 * URIs for gyms.
 */
public class GymPath {

    public static final String GYMS_LIST_BY_URL = "/gyms";

    /**
     * URI for gyms create.
     */
    public static final String GYM_CREATE_URL = "/gyms/create";

    public static final String GYM_UPDATE_URL = "/gyms/update";

    public static final String PARAM_GYM_ID = "gymId";

    public static final String GYM_DELETE_URL = "/gyms/delete/{" + PARAM_GYM_ID + "}";

    private GymPath() {
    }
}
