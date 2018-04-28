package hotelManagement;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class HotelApp extends Controller{
	private static boolean MainMenu = true;
    private static boolean SubMenu = true;
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        Room[] myHotel = new Room[10];
        myHotel[0] = new Room(0);
        myHotel[1] = new Room(0);
        myHotel[2] = new Room(0);
        myHotel[3] = new Room(0);
        myHotel[4] = new Room(0);
        myHotel[5] = new Room(0);
        myHotel[6] = new Room(0);
        myHotel[7] = new Room(0);
        myHotel[8] = new Room(0);
        myHotel[9] = new Room(0);
        int roomNum = 0;
        initialise(myHotel);
        while (MainMenu) {
        	while (SubMenu) {
                System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
                System.out.println("Hello and Welcome to our Hotel Program");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("Please select one of the options.");
                System.out.println("R: Room Status R.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("Please select one of the options.");
                System.out.println("A: Checkin A New Room.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("E: Display Empty Rooms.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("V: View all Rooms.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("D: Delete customer from room.");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("F: Find room from customer name.");
                
                String Selection = input.next();
                Selection = Selection.toUpperCase();
                switch (Selection) {
                case "A":
                	CheckinRoom(myHotel, roomNum);
                    break;
                case "E":
                    CheckIfEmpty(myHotel);
                    break;
                case "V":
                    ViewAllRooms(myHotel);
                    break;
                case "D":
                    DeleteCustomerFromRoom(myHotel, roomNum);
                    break;
                case "F":
                    FindRoomFromCustomerName(myHotel);
                    break; 
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
            System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("Would you like to Select another Option\n1 ) Yes\n2 ) No");
            System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            if (input.nextInt() == 1) {
                SubMenu = true;
            } else {
                SubMenu = false;
            }
        }
        SubMenu = true;
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Would You Like To Continue With The Program\n1 ) Yes\n2 ) No");
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        if (input.nextInt() == 1) {
            MainMenu = true;
        } else {
            System.out.println("Remember to smile!a");
            System.exit(0);

        }
    }

}
                

}

