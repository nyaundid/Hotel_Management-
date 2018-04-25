package hotelManagement;
// Vikings Team Project
//It is going to be a nice project 
import java.util.Scanner;
public class HCSApp {
	private static PatronList pStore;
	private static inroomdinning cStore;
	private static Manage coManage;
	

	public static void main(String[] args) {

		pStore = new PatronList();
		cStore = new inroomdinning("20");
		coManage = new Manage(pStore, cStore);
		System.out.println("Welcome...... ");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		boolean start = true;
		while (start) {
			System.out.println("======================= \nPlease choose from the following options:");
			System.out.println("\t- Enter 1 if FrontDesk");
			System.out.println("\t- Enter 2 to display Patron's information");
			System.out.println("\t- Enter 3 to exit");
			String input = scan.nextLine();
			switch (input) {
			case "1":
				doCheckOut();
				break;
			case "2":
				displayPatronInfo();
				break;
			case "3":
				System.out.println("Thank you for using our program ");
				start = false;
				break;
			}
		}
	}

	private static void doCheckOut() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter RoomNumber ");
		String PID = scan.next();
		if (PID.equals("1")) 
		{
			System.out.println("Transaction canceled.... ");
			return;
		}

		Patron Patron = coManage.startNewTransaction(PID);
		System.out.println(Patron);
		coManage.setPatron(Patron);

		String MBID = " ";	
		while ( Patron != null ) {
			minibar bar=new minibar();
			System.out
					.println("Please enter copy ID to check out, 0 to complete transaction OR 1 to cancel transaction");
			MBID = scan.next();
			
			if (MBID.equals("0")) {
				coManage.endTransaction();
				System.out.println("End of transaction... \n");
				break;
			}
			
		
			if (MBID.equals("1")) 
			{
				coManage.endTransaction();
				System.out.println("Transaction canceled....");
				break;
			}
			
			bar = coManage.checkOutCopy(MBID);
			System.out.println("copy checked out \t" + bar);
			
			if (bar == null)
				System.out.println("Bad input... Try again");
			
			
			
			
			
		
			
		}		
			
	
	}

	private static void displayPatronInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Patron's ID OR 0 to quit");
		String PID = scan.next();
		if (PID.equals("0")) {
			System.out.println(" Thank you ");
			System.exit(0);
	

}}}