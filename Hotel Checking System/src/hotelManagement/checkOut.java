package hotelManagement;
import java.util.LinkedList;
import java.util.*;


public class checkOut {        
	Home h = new Home();
	public void removeMember(LinkedList<Member> m){
        int confirmationNo;

        //Member cf = new Member('0', confirmationNo, null, confirmationNo);
        System.out.print("\nEnter Member ID to remove: ");
        confirmationNo = h.getIntInput();

        for (int i = 0; i<m.size();i++)
        {            
            if (m.get(i).getconfirmationNo() == confirmationNo)
            {
                m.remove(i);
                System.out.print("\nMember Removed\n");
                return;                

            }        
        }        
        
        System.out.println("\nMember ID not found\n");                
    }

            
        
    }

