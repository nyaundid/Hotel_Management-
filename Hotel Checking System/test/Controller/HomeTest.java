package Controller;

import static org.junit.Assert.*;

import org.junit.Test;
import Controller.Home;
//import hotelManagement.FrontDiskView;
//import hotelManagement.DatabaseManager;
//import hotelManagement.JavaApplication;
//import hotelManagement.RoomService;
//import hotelManagement.HouseKeeping;
//import java.io.IOException;
import java.util.InputMismatchException;

public class HomeTest {
private Home home = new Home();

	@Test(expected = InputMismatchException.class)
	public void testGetIntInput() {
		try{
			home.getIntInput();
			
		}
		catch (Exception e){
			fail("Can't do that");
		}
		
	}
	
	@Test 
	public void testDisplayEmployee() {
		try{
			//code goes here
		}
		catch(Exception e){
			fail("Can't do that");
		}
	}

	@Test
	public void testSetup() {
		try{
			
			home.setup();
			home.getIntInput();
			home.displayEmployee();
			home.reader.nextLine();
			
		}
		catch(Exception e){
			fail("Can't do that");
		}
	}
}
	
