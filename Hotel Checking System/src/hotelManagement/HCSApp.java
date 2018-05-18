package hotelManagement;
import java.util.Scanner;
public class HCSApp {
	public static void main(String[] args) {
	        System.out.println("Welcome to Mr John's Family Hotel.");
	        Scanner aScanner = new Scanner(System.in);
	        System.out.println("Number of guests. ");
	        int numberOfGuests = aScanner.nextInt();
	        System.out.println(
	         "Number of days staying at the hotel ");
	        int numberOfNights = aScanner.nextInt();
	        if (numberOfNights <=2 && numberOfGuests == 1) {
	        System.out.println("For " + numberOfGuests + " guest staying for "
	         + numberOfNights + " nights, it will cost "
	         + "$" + 95 * numberOfNights);
	        } 
	        else if (numberOfNights <=2 && numberOfGuests >1) {
	        System.out.println("For " + numberOfGuests + " guests staying for "
	         + numberOfNights + " nights, it will cost " + "$" + numberOfNights * 80);
	        }
	        else if (numberOfNights >2 && numberOfGuests == 1) {
	        System.out.println("For " + numberOfGuests + " guest staying for "
	         + numberOfNights + " nights, it will cost " + "$"
	         +  (2*95*numberOfGuests + (numberOfNights - 2)*65*numberOfGuests));
	        }
	        else if (numberOfNights >2 && numberOfGuests > 1) {
	        System.out.println("For " + numberOfGuests + " guests staying for "
	         + numberOfNights + " nights, it will cost " + "$"
	         +  (2*80*numberOfGuests + (numberOfNights - 2)*50*numberOfGuests));}
	        }
	}

