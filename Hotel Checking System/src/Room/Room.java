
package Room;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Room {
	public int roomID;
	public int roomNo;
	public String statusHK;
	public String statusRS;
	
	public Room(int roomID,int roomNo, String statusHK, String statusRS){
		this.roomID = roomID;
		 this.roomNo = roomNo;
		 this.statusHK = statusHK;
		 this.statusRS = statusRS;

	    }
	
	 public Room(int roomNo, String statusHK, String statusRS){
		 this.roomNo = roomNo;
		 this.statusHK = statusHK;
		 this.statusRS = statusRS;

	    }


public int getroomNo() {
    return roomNo;
}

public void setroomNo(int croomNo) {
    this.roomNo = croomNo;
}

}