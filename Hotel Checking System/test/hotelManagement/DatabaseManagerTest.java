package hotelManagement;

import static org.junit.Assert.*;

import java.io.IOException;

import org.json.JSONObject;
import org.junit.Test;

import Room.Room;
import Room.RoomTest;

public class DatabaseManagerTest {
	DatabaseManager manager = new DatabaseManager();
	@Test()
	public void testGetJsonOutput()  {
		
		try {
//			DatabaseManager(urlString);
			manager.getAvailableRooms();
			manager.setID("UTF-8", "UTF-8");
			manager.sendRequest();
			manager.urlString.equals(getClass());
			manager.getJsonOutput();
			manager.checkin("Bini", "LL22", "S", "1");
			manager.updateRoomStatusHK("1", "3");
			manager.updateRoomStatusRS("1", "1");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}



	@Test
	public void testGetVDRoom() throws IOException {
		try {
			manager.toString();
			manager.getVDRoom();
			
//			manager.getAllRooms();
//			manager.getJsonOutput();
		} catch (IOException e) {
			e.printStackTrace();
		}
		manager.getAllRooms();
	}

	@Test
	public void testGetAllRooms() {
		Room r = new Room(1, 101, "3", "1");
		try {
			manager.getAllRooms();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetAvailableRooms() {
		try {
			manager.getAvailableRooms();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetVCRooms()  {
		try {
			manager.getJsonOutput();
//			manager.sendRequest();
			manager.getVCRooms();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
