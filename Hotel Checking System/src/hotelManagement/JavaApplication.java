package hotelManagement;

import java.io.IOException;
import java.util.ArrayList;

import Controller.Home;

public class JavaApplication {
	public static void main(String[] args) throws IOException {
		DatabaseManager manager = new DatabaseManager();
		Home home = new Home();

		  home.setup();
		
}
	
}
