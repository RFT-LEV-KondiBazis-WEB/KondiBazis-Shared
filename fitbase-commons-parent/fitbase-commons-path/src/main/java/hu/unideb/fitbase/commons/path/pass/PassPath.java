package hu.unideb.fitbase.commons.path.pass;

import static hu.unideb.fitbase.commons.path.container.PathContainer.*;

/**
 * URIs for passes.
 */
public class PassPath {

    private static final String PASSES = "/passes";

    public static final String PASS_INFO = PASSES;

    public static final String PASS_CREATE = PASSES + CREATE;

    public static final String PASS_UPDATE = PASSES + UPDATE;

    public static final String PASS_DELETE = PASSES + DELETE;

    private PassPath() {
    }
}
