package hotelManagement;

import static org.junit.Assert.*;
import junit.framework.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import Room.Room;

public class RoomService_Test {

	@Test
	public void testRoomService() {
		RoomService rs = new RoomService();
		DatabaseManager manager = new DatabaseManager();
		try {
			rs.setup();
			rs.printChoices();
			rs.getValidChoice();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testgetValidChoice(){
		RoomService rs = new RoomService();
		DatabaseManager manager = new DatabaseManager();
		rs.printChoices();
		try {
			rs.printVCRooms();
			rs.getValidChoice();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test(expected=NullPointerException.class)
	public void testSetup()throws Exception {
		try {
			RoomService rs = new RoomService();
			DatabaseManager manager = new DatabaseManager();
			manager.getAvailableRooms();
			manager.setID("UTF-8", "UTF-8");
			manager.sendRequest();
			manager.urlString.equals(getClass());
			manager.getJsonOutput();
			manager.checkin("Bini", "LL22", "S", "1");
			manager.updateRoomStatusHK("1", "3");
			manager.updateRoomStatusRS("1", "1");
//			manager.updateRoomStatusHK("1", "OCC");
//			rs.setup();
//			rs.printChoices();
//			rs.printVCRooms();
//			rs.updateRoomStatus();
//			rs.getValidChoice();
			} 
		catch (Exception e) {
			Assert.fail("Room Service ");}
	}
	@Test(expected=NullPointerException.class)
	public void testUpdateRoomStatus()throws Exception {
		try{
		RoomService rs = new RoomService();
		DatabaseManager manager = new DatabaseManager();
		manager.getAvailableRooms();
		manager.updateRoomStatusHK("1", "3"); 
		//fail("Expected an IndexOutOfBoundsException to be thrown");
		}
		catch (IndexOutOfBoundsException anIndexOutOfBoundsException) {
	        fail(anIndexOutOfBoundsException.getMessage());
		}
	}
	
	
}
