package hu.unideb.fitbase.commons.path.gym;

/**
 * URIs for gyms.
 */
public class GymPath {

    public static final String PARAM_GYM_ID = "gymId";
    
    public static final String GYM_ID = "/{" + PARAM_GYM_ID + "}";
    
    /**
     * URI for create gyms.
     */
    public static final String GYM_CREATE_URL = "/gyms/create";
    
    /**
     * URI for update gyms.
     */
    public static final String GYM_UPDATE_URL = "/gyms/update";

    /**
     * URI for delete gyms.
     */
    public static final String GYM_DELETE_URL = "/gyms/delete";
    
    /**
     * URI for list of gyms.
     */
    public static final String GYMS_LIST_BY_URL = "/gyms";
    
    private GymPath() {
    }
}
