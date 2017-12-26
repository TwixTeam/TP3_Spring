package isep.web.sakila.webapi.model;

import junit.framework.TestCase;

public class CustomerWOTest extends TestCase {
	
    public static final int EXPECTED_ID = 00001;
    public static final String EXPECTED_LAST_NAME = "Fred";
    public static final String EXPECTED_FIRST_NAME = "Dupont";
    public static final String EXPECTED_EMAIL = "test@isep.fr";
    private CustomerWO Customer;

	protected void setUp() throws Exception {
		super.setUp();
		Customer = new  CustomerWO( 00001, "Fred", "Dupont", "test@isep.fr");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Test CustomerWO Completed");
	}
	
	public void testUserDetails() throws Exception {
        assertEquals(EXPECTED_FIRST_NAME, Customer.getFirstName());
        assertEquals(EXPECTED_LAST_NAME, Customer.getLastName());
        assertEquals(EXPECTED_ID, Customer.getCustomerId());
        assertEquals(EXPECTED_EMAIL, Customer.getEmail());
    }

}
