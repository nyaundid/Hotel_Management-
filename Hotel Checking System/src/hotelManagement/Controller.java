package hotelManagement;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {
	public static void initialise(Room[] myHotel) {
	    for (int x = 0; x < myHotel.length; x++) {
	        myHotel[x].setName("nobody");
	    }
	}

	public static void CheckIfEmpty(Room[] myHotel) {
	    for (int x = 0; x < myHotel.length; x++) {
	        if (myHotel[x].getName().equals("nobody")) {
	            System.out.println("room " + (x + 1) + " is empty");
	        }
	    }
	}
	
	public static void CheckIfClean(Room[] myHotel) {
	    for (int x = 0; x < myHotel.length; x++) {
	        if (myHotel[x].getStatus().equals("clean")) {
	            System.out.println("room " + (x + 1) + " is clean");
	        }
	    }
	}
	

	public static void CheckinRoom(Room[] myHotel, int roomNum) {
	    String roomName;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter room number (1-10):");
	    roomNum = input.nextInt() - 1;
	    System.out.println("Enter Guests name " + (roomNum + 1) + " :");
	    roomName = input.next();
	    myHotel[roomNum].setName(roomName);
	}

	public static void ViewAllRooms(Room[] myHotel) {
	    for (int x = 0; x < myHotel.length; x++) {
	        System.out.println("room " + (x + 1) + " occupied by " + myHotel[x].getName());
	    }
	}

	public static void DeleteCustomerFromRoom(Room[] myHotel, int roomNum) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter room number to delete(1-10):");
	    roomNum = input.nextInt() - 1;
	    myHotel[roomNum].setName("nobody");
	    System.out.println("Entery Deleted :)");
	}

	public static void FindRoomFromCustomerName(Room[] myHotel) {
	    Scanner input = new Scanner(System.in);
	    String roomName;
	    System.out.println("Enter name to Search for:");
	    roomName = input.next();
	    int x;
	    boolean Checker = false;
	    for (x = 0; x < myHotel.length; x++) {
	        if (roomName.equals(myHotel[x].getName())) {
	            System.out.println("The Account That Matches That name is Account number " + x);
	            Checker = true;
	        }
	    }
	    if (Checker == false) {
	        System.out.println("There are no Rooms Booked with that name\n(make sure you've used the correct CAP's)");
	    }
	}

	public static void StoreProgramDataInToFile(Room[] myHotel) throws IOException {
	    try (PrintWriter out = new PrintWriter(new FileWriter("/home/unix/student12/w1387769/outputfile.txt"))) {
	        int x;
	        for (x = 0; x < myHotel.length; x++) {
	            out.println("Name and Room number is: " + myHotel[x].getName() + "at: " + x);
	        }

	    }
	    System.out.println("All Room Names have been Saved.");
	}
}

	

