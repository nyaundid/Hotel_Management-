
public class Patron {
	private Patron[] Patron = new Patron[40];
	private int numCus;
	private String name;
	

	public Patron(){
	}//no-arg constructor

	public Patron(String n, double p){
	name = n;
	numCus ++;
	}//end constructor

	public String getName(){
	return name;
	}

	public Patron[] getPatron(){
	return Patron;
	}




	public void printCus(){
	System.out.printf("Patron name: %s", name);
	}

	}

