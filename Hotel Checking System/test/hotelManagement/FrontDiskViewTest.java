package hotelManagement;

import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.Before;
import org.junit.Test;

import Controller.Home;
import hotelManagement.FrontDiskView;
import hotelManagement.DatabaseManager;
import hotelManagement.JavaApplication;
import hotelManagement.RoomService;
import hotelManagement.HouseKeeping;


public class FrontDiskViewTest {
	@Test()
	public void testFrontDiskView1() {
		
try {
			FrontDiskView fdv = new FrontDiskView();
			fdv.setup();
			fdv.checkIn();
			
			
		}
		catch (Exception e) {
			fail("Add number entry only");
		}
		
	}
	
	public void testFrontDiskView()throws Exception {
		DatabaseManager manager;
	}
}
