package hotelManagement;

import java.util.ArrayList;

public class Manage 
{	
	private PatronList PatronList= new PatronList();
	private inroomdinning inroomdinning = new inroomdinning("y");
	
	private Patron Patron;
	private minibar MB;
	private ArrayList <minibar> minibarEntered;
 	
	Manage (PatronList ps, inroomdinning cs)
	{
		PatronList= ps;
		inroomdinning = cs;
		minibarEntered= new ArrayList <minibar>();  
	}
	
	public Patron startNewTransaction (String PID)
	{
		minibarEntered.clear();
		Patron p = PatronList.fetchPatron(PID);
		return p;
	}
	
	public void setPatron (Patron p)
	{
		this.Patron=p;
	}

	public void endTransaction() {
	
			for (minibar mini : minibarEntered)
			{
			Patron.checkOut(mini);	
			}	
		}

	public minibar checkOutCopy (String MBID)
	{
		inroomdinning = minibar.fetchCopy(MBID);
		if (MB != null)
		minibarEntered.add(MB);
		return MB;
	}
	
//not finished//
	
	}
	
