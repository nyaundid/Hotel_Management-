package hotelManagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.Home;
import Room.Room;

public class RoomService {

	Scanner scan = new Scanner(System.in);

	  Home mm = new Home();
	  DatabaseManager manager;
	  
	  public RoomService(){
		  manager = new DatabaseManager();
	  }
  public void setup() throws IOException{
			int number = 0;
			while(number != -1){
			printChoices();
			 number = getValidChoice();
			if(number == -1){
			mm.displayEmployee();
			
			}
			else 
			{
				switch (number){
				case 1:
					printVCRooms();
					break;
				case 2:
					updateRoomStatus();
					break;
				}
			}
		}
  }
  
  private void updateRoomStatus() throws IOException {
	  ArrayList<Room> roomList = manager.getVCRooms();
	  int roomID = 0;
	  scan = new Scanner(System.in);
	  System.out.print("\nPlease enter the Room No.: ");
	  int roomNumber = scan.nextInt();
	  scan = new Scanner(System.in);
	  System.out.print("\nPlease enter the Room Status: ");
	  String roomStatus = scan.nextLine();
	  
	  for(Room room : roomList){
		  if(room.roomNo == roomNumber){
			  roomID = room.roomID;
		  }
	  }
	  
	  System.out.print("RoomID"+roomID);
	  
	  if(manager.updateRoomStatusRS(""+roomID, roomStatus)){
		  System.out.println("\n Updated Successfully");
	  }else{
		  System.out.println("\n Failed to Update");
	  } 
	
}
private void printVCRooms() throws IOException {
	ArrayList<Room> roomList = manager.getVCRooms();
	//Here is the error, because the roomlist is empty
	//have to check first
	if(roomList == null || roomList.size() < 1){
		//Here the list will be empty
		System.out.println("\nNothing to show");
		return;
	}
    System.out.println("Room No. \t Room Status \t Minibar Status" );

	for (Room room : roomList){
	    	System.out.println(room.roomNo + "\t" + room.statusHK + "\t" + room.statusRS);

	}
	
}
private void printChoices(){
		System.out.println("\n1) Print Room List");
	    System.out.println("2) Update Room Status");
	    
		System.out.print("\nPlease select an option (or Enter -1 to quit): ");

	}

	private int getValidChoice(){
		int number = scan.nextInt();
		
		while (number > 3 & number < 1){
			if (number == -1){
				return -1;
			}
			System.out.println("\nERROR: INVALID INPUT. Please try again: "); 
			printChoices();	
		}
		return number;
	}
}
