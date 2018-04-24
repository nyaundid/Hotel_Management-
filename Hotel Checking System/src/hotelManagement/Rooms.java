package hotelManagement;

public class Rooms {
	private Rooms[] room = new Rooms[120];
	private int roomNum;
	private String type;
	public String roomStatus;
	private int numRoomsSingle = 0;
	private int numRoomDouble = 0;
	private int numRoomsO =0;
	public Rooms(){
	}//no-arg constructor

	public Rooms(int n, double r, String t, String s){
		roomNum = n;
		type = t;
		roomStatus = s;
		
		

		}// Room constructor made to initialise variables.

}
