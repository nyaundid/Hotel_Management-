package hotelManagement;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseKeepingTest {

	@Test
	public void testHouseKeeping() {
		HouseKeeping myobject=new HouseKeeping(); // with args

		myobject.load(DatabaseManager); // you must definie the filename

		String result=myobject.scaninput_and_compare(); // you must use scan in, and compare

		if (!result.equals(what_I_am_expecting) throw new Exception("EXCEPTION scaninput_and_compare"); 

		// If you arrive here, it's OK
		}

	@Test
	public void testSetup() {
		fail("Not yet implemented");
	}

}
