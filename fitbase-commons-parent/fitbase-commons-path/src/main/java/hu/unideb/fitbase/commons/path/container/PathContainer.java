package hu.unideb.fitbase.commons.path.container;

public class PathContainer {

    public static final String PARAM_GYM_ID = "gymId";

    public static final String PARAM_PASS_ID = "passId";

    public static final String CREATE = "/create";

    public static final String UPDATE = "/update";

    public static final String DELETE = "/delete";

    public static final String GYM_ID = "/{" + PARAM_GYM_ID + "}";

    public static final String PASS_ID = "/{" + PARAM_PASS_ID + "}";

}
