package Controller;

import static org.junit.Assert.*;

import org.junit.Test;

import Controller.Home;
import hotelManagement.FrontDiskView;
import hotelManagement.DatabaseManager;
import hotelManagement.JavaApplication;
import hotelManagement.RoomService;
import hotelManagement.HouseKeeping;
public class HomeTest {

	@Test
	public void testGetIntInput() {
	try{
		DatabaseManager manager = new DatabaseManager();
		Home home = new Home();	
		manager.getJsonOutput();
		home.displayEmployee();
		assertArrayEquals(null, null);
	}
	
	@Test
	public void testDisplayEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetup() {
		fail("Not yet implemented");
	}
	catch (Exception e){
		fail("Can't do that");
	}
}
