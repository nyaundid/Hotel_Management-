package hotelManagement;
import java.util.HashMap;
public class PatronList {
	String Pid;
	private HashMap <String, Patron> PatronList;
	public PatronList()
	{// placed a yes and no for holds
		PatronList = new HashMap <String, Patron>();
		PatronList.put ("10", new Patron ("10", "Biniam", "Y", "MNBR", "VC" ));
		PatronList.put ("20", new Patron ("20", "Darius", "y", "MNMN", "VD"));
		PatronList.put ("30", new Patron ("30", "Patrice", "Y", "M", "VV"));
		PatronList.put ("40", new Patron ("40", "Elvis", "N", "N", "B"));
	}


	public Patron fetchPatron(String PID) {
		Pid = PID;
		Patron searchResult= null;
		
		searchResult = pListSearch(PID ,searchResult);
		return searchResult;								
	}
	
	
	

	public Patron pListSearch(String PID , Patron searchResult) 
	{
		boolean x= true;
		for (int i = 0; i < PatronList.size(); i++) 
		{
			 x = PatronList.containsKey(PID);
			if (x) 
			{
				searchResult= PatronList.get(PID);
				break;			
			}	
			else
				x=false;
		}
		if (!x)
			System.out.println("Patron does not exist");
		
		return searchResult;
	}
}


