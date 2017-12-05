package hu.unideb.fitbase.commons.path.gym;

import static hu.unideb.fitbase.commons.path.container.PathContainer.CREATE;
import static hu.unideb.fitbase.commons.path.container.PathContainer.DELETE;
import static hu.unideb.fitbase.commons.path.container.PathContainer.UPDATE;

/**
 * URIs for gyms.
 */
public class GymPath {

    public static final String GYMS = "/gyms";

    public static final String GYM_CREATE = GYMS + CREATE;

    public static final String GYM_UPDATE = GYMS + UPDATE;

    public static final String GYM_DELETE = GYMS + DELETE;

    public static final String GYM_LIST_USER = GYMS;

    private GymPath() {
    }
}
