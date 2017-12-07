package hu.unideb.fitbase.commons.path.gym;

/**
 * URIs for gyms.
 */
public class GymPath {
    public static final String PARAM_GYM_ID = "gymId";

    public static final String GYM_ID = "/{" + PARAM_GYM_ID + "}";

    /**
     * URI for list of gyms.
     */
    public static final String GYMS = "/gyms";

    private GymPath() {
    }
}

