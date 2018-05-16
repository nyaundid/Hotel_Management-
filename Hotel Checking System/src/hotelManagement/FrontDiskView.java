package hotelManagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.Home;
import Member.Member;
import Room.Room;


public class FrontDiskView {
  Scanner scan = new Scanner(System.in);

  
  DatabaseManager manager;
  
  public FrontDiskView(){
	  manager = new DatabaseManager();
  }
  

public void setup() throws IOException{
	int number = 0;
	while(number != -1){
	printChoices();
	 number = getValidChoice();
	if(number == -1){
	
	
	}
	else 
	{
		switch (number){
		case 1:
			printAllRooms();
			break;
		case 2:
			printAvailableRooms();
			break;
		case 3:
			checkIn();
			break;
		}
	}
	}
}

private void printChoices(){
	System.out.println("\n1) Print rooms report");
    System.out.println("2) Print available rooms");
    System.out.println("3) Check-in");
    
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
private void printAllRooms() throws IOException{
	
	ArrayList<Room> roomList = manager.getAllRooms();
	
    System.out.println("Room No. \t Room Status \t Minibar Status" );
	for (Room room : roomList){
	    System.out.println(room.roomNo + "\t" + room.statusHK + "\t" + room.statusRS);

	}
}
private void printAvailableRooms() throws IOException{
	
	ArrayList<Room> roomList = manager.getAvailableRooms();
	
    System.out.println("Room No. \t Room Status \t Minibar Status" );
	for (Room room : roomList){
		if (room.statusHK.equals("VC") && room.statusRS.equals("MBR"))
			System.out.println(room.roomNo + "\t" + room.statusHK + "\t" + room.statusRS);

	}

}

private void checkIn() throws IOException{
	printAvailableRooms();
	
	Member member = new Member();
	scan = new Scanner(System.in);
  System.out.print("\nPlease enter the Confirmation No.: ");
  member.confirmationNo = scan.nextLine();
  scan = new Scanner(System.in);
  System.out.print("\nPlease enter the member's name: ");
  member.name = scan.nextLine();
  scan = new Scanner(System.in);
  System.out.print("\nPlease enter the membership type: ");
  member.memberType = scan.nextLine();
  scan = new Scanner(System.in);
  System.out.print("\nPlease enter the room number: ");
  member.roomNo = scan.nextLine();
  
  if(manager.checkin(member.name, member.confirmationNo, member.memberType, ""+member.roomNo)){
	  System.out.println("\nChecked-In Successfully");
  }else{
	  System.out.println("\nFailed to Checked-In");
  } 
}

}
