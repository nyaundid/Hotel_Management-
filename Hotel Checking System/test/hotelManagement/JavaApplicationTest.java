package hotelManagement;

import static org.junit.Assert.*;

import org.junit.Test;

import Controller.Home;

import hotelManagement.FrontDiskView;
import hotelManagement.DatabaseManager;
import hotelManagement.JavaApplication;
import hotelManagement.RoomService;
import hotelManagement.HouseKeeping;
public class JavaApplicationTest {

	@Test
	public void testMain() {
		try{
		DatabaseManager manager = new DatabaseManager();
			
		manager.getJsonOutput();
		}
		catch (Exception e){
			fail("Can't do that");
		}
	}

}
