package hotelManagement;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class HouseKeepingTest {

	@Test
	public void testHouseKeeping() throws IOException {
		int number;
	    boolean expectedFail = false;
		try{
        	HouseKeeping hsk = new hotelManagement.HouseKeeping();
        	number = hsk.getValidChoice();
        	hsk.getValidChoice();
        	hsk.printChoices();
        	hsk.setup();
        	hsk.printVDRooms();
        	hsk.updateRoomStatus();
        	//fail("input must be number(Integer)");
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
