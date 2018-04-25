package hotelManagement;

public class Patron {
	private Patron[] Patron = new Patron[80];
	private int numCus;
	private int patronID;
	private String address;
    private String phoneNo;
    
    //both first and last used in getName method
    private String nameFirst = "";
	private String nameLast = "";
	
	public Patron(){
	}//no-arg constructor

	public Patron(int id){
	patronID = id;
	numCus ++;
	}//end constructor
	
    public int getPatronID() {
    	
    	return patronID;
    }
    
    public void setPatronID(int patronID) {
    	this.patronID = patronID;
    }
    
	public String getName(){
		
		String name = nameFirst + nameLast;  
		
		return name;
		}
		

		
	public Patron[] getPatron(){
	return Patron;
	}




	public void printCus(){
	System.out.printf("Patron name: %s", nameFirst + nameLast);
	}

	}

