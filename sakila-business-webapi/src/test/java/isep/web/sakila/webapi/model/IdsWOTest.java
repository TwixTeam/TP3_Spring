package isep.web.sakila.webapi.model;

import junit.framework.TestCase;

public class IdsWOTest extends TestCase {
	
	public static final int EXPECTED_CID = 0001;
	public static final int EXPECTED_FID = 0002;
	private IdsWO Ids;

	protected void setUp() throws Exception {
		super.setUp();
		Ids = new IdsWO(0001, 0002);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Test IdsWO Completed");
	}
	
	public void testUserDetails() throws Exception {
        assertEquals(EXPECTED_CID, Ids.getCustomerId());
        assertEquals(EXPECTED_FID, Ids.getFilmId());
    }

}
