package hotelManagement;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
//import checkOut;

public class Home {
	//checkOut chc = new checkOut();
	
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
    
    private void printmemberOptions(){
        System.out.println("\n1) Silver Member");
        System.out.println("2) Gold Member");
        System.out.println("3) Non-member");
        
    }    
    
    public int getChoice(){
        int choice;
        
        System.out.println("\nWELCOME TO HOTEL CHECKIN MANAGEMENT SYSTEM,");
        System.out.println("================================");
        System.out.println("1) Front Desk");
        System.out.println("2) In Room Service");
        System.out.println("3) House Keeping");

        System.out.print("\nPlease select an option (or Enter -1 to quit): ");

        choice = getIntInput();
        
        return choice;
    }

    public String addMembers(LinkedList<Member> m)
    {
        String name;
        int member;
        String mem;
        double fees;
        int confirmationNo; 
        Member mbr;
        Calculator<Integer> cal;    

        System.out.print("\nPlease enter the member's name: ");
        name = reader.nextLine();

        printmemberOptions();
        System.out.print("\nPlease enter the member's confirmationNo: ");
        member = getIntInput();

        while (member < 1 || member > 3)
        {
            System.out.print("\nInvalid member ID. Please try again: ");
            member = getIntInput();

        }
        
        if (m.size() > 0)
            confirmationNo = m.getLast().getconfirmationNo() + 1;
        else
            confirmationNo = 1250;

        if (member != 3)
        {	
            cal = (n)-> {           
                switch (n)
                {
                    case 1:
                        return 900;     
                    case 2:
                        return 950;
                    case 3:
                        return 1000;
                    default:
                        return -1;
                }
            };
            
            fees = cal.calculateFees(member);
            
            mbr = new SilverMember('S', confirmationNo, name, fees);
            m.add(mbr);
            mem = mbr.toString();
            
            System.out.println("\nSTATUS: Silver member Member added\n");            
        }
        else
        {
            cal = (n) -> {
                
                if (n == 2)
                    return 1200;
                else
                    return -1;
            };
            
            fees = cal.calculateFees(member);
            
            mbr = new GoldMember('G', confirmationNo, name, fees);
            m.add(mbr);
            mem = mbr.toString();
            
            System.out.println("\nSTATUS: Gold member Member added\n");     
            
        }
//        else
//        	{
//                cal = (n) -> {
//                    
//                    if (n == 3)
//                        return 1200;
//                    else
//                        return -1;
//                };
//                
//                fees = cal.calculateFees(member);
//                
//                mbr = new NonMember('N', confirmationNo, name, fees);
//                m.add(mbr);
//                mem = mbr.toString();
//                
//                System.out.println("\nSTATUS: Non member Member added\n");     
//                
//            }
//        
      return mem;

    }
    public void printMemberInfo(LinkedList<Member> m){

        int confirmationNo;
        
        System.out.print("\nEnter Member ID to display information: ");
        confirmationNo = getIntInput();

        for (int i = 0; i<m.size();i++)
        {            
            if (m.get(i).getconfirmationNo() == confirmationNo)
            {
                String[] memberInfo = m.get(i).toString().split(", ");                 

                System.out.println("\n\nMember Type = " + memberInfo[0]);               
                System.out.println("Member ID = " + memberInfo[1]);
                System.out.println("Member Name = " + memberInfo[2]);
                System.out.println("Membership Fees = " + memberInfo[3]);
                
                if (memberInfo[0].equals("S"))
                {
                    System.out.println("member ID = " + memberInfo[4]);                                        
                }else
                {
                    System.out.println("Membership Points = " + memberInfo[4]);                    
                }                
                return;
            }        
        }        
        
        System.out.println("\nMember ID not found\n");        
    
    
    
    }
    }
