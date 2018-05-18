package Controller;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
//import checkOut;

import hotelManagement.FrontDiskView;
import hotelManagement.HouseKeeping;
import hotelManagement.RoomService;


public class Home {	
	
final public Scanner reader = new Scanner(System.in);
    
    public int getIntInput(){
        int choice = 0;
        
        while (choice == 0)
        {
            try
            {
		choice = reader.nextInt();
                
                if (choice == 0)                
                    throw new InputMismatchException();
                
                reader.nextLine();
            }
            catch (InputMismatchException e) 
            {
		reader.nextLine();
                System.out.print("\nERROR: INVALID INPUT. Please try again: ");                
            }
        }
        
        return choice;        
    }
    
//    private void printmemberOptions(){
//        System.out.println("\n1) Silver Member");
//        System.out.println("2) Gold Member");
//        System.out.println("3) Non-member");
//        
//    }    
    
    public void displayEmployee(){
        
        System.out.println("\nWELCOME TO HOTEL CHECKIN MANAGEMENT SYSTEM,");
        System.out.println("================================");
        System.out.println("1) Front Desk");
        System.out.println("2) House Keeping");
        System.out.println("3) In Room Service"); 

        System.out.print("\nPlease select an option (or Enter -1 to quit): ");

    }
    
    
    private int getValidChoice(){
    	int number = reader.nextInt();
    	
    	while (number > 3 & number < 1){
    		if (number == -1){
    			return -1;
    		}
    		System.out.println("\nERROR: INVALID INPUT. Please try again: "); 
    		displayEmployee();	
    	}
    	return number;
    }
    
    public void setup() throws IOException{
    	int number = 0;
    	while(number != -1){
    	displayEmployee();
    	 number = getValidChoice();
    	if(number == -1){
    	displayEmployee();
    	
    	}
    	else 
    	{
    		switch (number){
    		case 1:
    			FrontDiskView disk = new FrontDiskView();
    			disk.setup();
    			break;
    		case 2:
    			HouseKeeping house = new HouseKeeping();
    			house.setup();
    			break;
    		case 3:
    			RoomService service = new RoomService();
    			service.setup();
    			break;
    		}
    	}
    	
    	}
    }
}
    
    
//    public int getChoiceFD(){
//        int choice;
// 
//        System.out.println("1) Print rooms report");
//        System.out.println("2) Print available rooms");
//        System.out.println("3) Check-in");
//
//        System.out.print("\nPlease select an option (or Enter -1 to quit): ");
//
//        choice = getIntInput();
//        
//        return choice;
//    }

//    private HashMap<Integer, String> roomStatus = new HashMap<Integer, String>();
//    public String AddRoomStatus(HashMap<Integer, String> roomStatus)
//    {
//        int roomNo;
//        String status;
        //////////////
//        String confirmationNo; 
//        Calculator<Integer> cal;    

//        System.out.print("\nPlease enter the Confirmation No.: ");
//        confirmationNo = reader.nextLine();
//
//        System.out.print("\nPlease enter the member's name: ");
//        name = reader.nextLine();
//        
//        printmemberOptions();
//        System.out.print("\nPlease enter the membership type: ");
//        member = getIntInput();
//
//        while (member < 1 || member > 3)
//        {
//            System.out.print("\nInvalid membership type. Please try again: ");
//            member = getIntInput();
//
//        }
        /////////////

//    public void printMemberInfo(LinkedList<Member> m){
//
//        String confirmationNo;
//        
//        System.out.print("\nEnter Confirmation No. to display information: ");
//        confirmationNo = getIntInput();
//
//        for (int i = 0; i<m.size();i++)
//        {            
//            if (m.get(i).getconfirmationNo() == confirmationNo)
//            {
//                String[] memberInfo = m.get(i).toString().split(", ");                 
//
//                System.out.println("\n\nMember Type = " + memberInfo[0]);               
//                System.out.println("Confirmation No. = " + memberInfo[1]);
//                System.out.println("Member Name = " + memberInfo[2]);
//                System.out.println("Membership Fees = " + memberInfo[3]);
//                
//                if (memberInfo[0].equals("S"))
//                {
//                    System.out.println("Confirmation No. = " + memberInfo[4]);                                        
//                }else
//                {
//                    System.out.println("Membership Points = " + memberInfo[4]);                    
//                }                
//                return;
//            }        
//        }        
//        
//        System.out.println("\nMember ID not found\n");        
//    
//    
//    
//    }

