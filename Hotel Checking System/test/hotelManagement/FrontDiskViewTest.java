package hotelManagement;

import static org.junit.Assert.*;
//import hotelManagement.FrontDiskView;

import org.junit.Before;
import org.junit.Test;

import Controller.Home;
import hotelManagement.FrontDiskView;
import hotelManagement.DatabaseManager;
import hotelManagement.JavaApplication;
import hotelManagement.RoomService;
import hotelManagement.HouseKeeping;

public class FrontDiskViewTest {

	public void testFrontDiskView1() {
		
try {
			Home mm = new Home();
			FrontDiskView fdv = new FrontDiskView();
			fdv.printChoices();
			fdv.getValidChoice();
			fdv.printAvailableRooms();
			fdv.checkIn();
		}
		catch (Exception e) {
			fail("We can't do that");
		}
		
	}
	
	public void testFrontDiskView()throws Exception {
		Home mm = new Home();
		DatabaseManager manager;
	}
}
