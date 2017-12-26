package isep.web.sakila.webapi.model;

import java.util.Date;

import isep.web.sakila.jpa.entities.Inventory;
import junit.framework.TestCase;

public class RentalWOTest extends TestCase {

	private final int EXPECTED_ID = 00001;
	private final Date EXPECTED_RENTAL_DATE = new Date(0);
	private final int EXPECTED_CUSTOMER_ID = 0002;
	private Inventory i = new Inventory();
	private final Inventory EXPECTED_INVENTORY = i;
	private RentalWO Rental;

	protected void setUp() throws Exception {
		super.setUp();
		Rental = new RentalWO(00001, new Date(0), 0002, i);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Test RentalWO Completed");
	}
	
	public void testUserDetails() throws Exception {
        assertEquals(EXPECTED_ID, Rental.getRentailId());
        assertEquals(EXPECTED_RENTAL_DATE, Rental.getRentalDate());
        assertEquals(EXPECTED_CUSTOMER_ID, Rental.getCustomerId());
        assertEquals(EXPECTED_INVENTORY, Rental.getInventory());
    }

}
