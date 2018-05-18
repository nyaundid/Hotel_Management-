package Room;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoomTest {
	Room r = new Room(1, 101, "3", "1");
	
	@Test
	public void testRoomIntIntStringString() {
		Room r = new Room(101, "3", "1");
	}

	@Test
	public void testRoomIntStringString() {
		r.toString();
	}

	@Test
	public void testGetroomNo() {
		r.getroomNo();
	}

	@Test
	public void testSetroomNo() {
		r.setroomNo(1);
	}



}
