package isep.web.sakila.webapi.model;

import junit.framework.TestCase;

public class CountryWOTest extends TestCase {
	
    public static final String EXPECTED_COUNTRY_NAME = "France";
    public static final int EXPECTED_ID = 00001;
    private CountryWO Country;

	protected void setUp() throws Exception {
		super.setUp();
		Country = new CountryWO(00001, "France");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Test CountryWO Completed");
	}

    public void testCountryDetails() throws Exception {
        assertEquals(EXPECTED_ID, Country.getCountryId());
        assertEquals(EXPECTED_COUNTRY_NAME, Country.getCountry());

    }

}
