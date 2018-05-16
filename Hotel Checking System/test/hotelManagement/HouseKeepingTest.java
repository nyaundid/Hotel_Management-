package hotelManagement;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseKeepingTest {

	@Test
	public void testHouseKeeping() {
        try{
        	HouseKeeping.updateRoomStatus();
        	fail("input must be number(Integer)");
        }	
        	catch (IllegalArgumentException e) {
    			// expected exception
    		}
         
		}

	@Test
	public void testSetup() {
		fail("Not yet implemented");
	}

}
