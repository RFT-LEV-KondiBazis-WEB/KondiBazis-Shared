package hu.unideb.fitbase.commons.path.customer;

/**
 * URIs for Customer.
 */

public class CustomerPath {

	public static final String PARAM_CUST_ID = "custId";
	
	public static final String CUST_ID = "/{" + PARAM_CUST_ID + "}";
	
    /**
     * URI for create customer.
     */
    public static final String CUST_CREATE_URL = "/cutsomer/create";
    
    /**
     * URI for update customer.
     */
    public static final String CUST_UPDATE_URL = "/customer/update";
    

    /**
     * URI for delete customer.
     */
    public static final String CUST_DELETE_URL = "/customer/delete";
    
    /**
     * URI for list customers.
     */
    public static final String CUST_LIST_BY_URL = "/customer";
    
    private CustomerPath() {
    	
    }
}
