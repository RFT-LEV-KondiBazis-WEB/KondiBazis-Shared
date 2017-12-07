package hu.unideb.fitbase.commons.path.customer;

/**
 * URIs for Customer.
 */

public class CustomerPath {

	public static final String PARAM_CUST_ID = "custId";
	
	public static final String CUST_ID = "/{" + PARAM_CUST_ID + "}";
	
    /**
     * URI for list customers.
     */
    public static final String CUSTOMERS = "/customers";
    
    private CustomerPath() {
    }
}
