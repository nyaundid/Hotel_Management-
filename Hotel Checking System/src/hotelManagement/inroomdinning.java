package hotelManagement;

public class inroomdinning {
	private String MBID;
	private Patron MB;

	public inroomdinning (String R)
	{
		MBID=R;
	}

	public String getMBID() {
		return MBID;
	}
	
	public void setMBTo(Patron p)
	{
		MB=p;
	}
	
	public Patron getMBTo()
	{
		return MB;
	}
	
	public String toString()
	{
		return "\t Copy id:" + MBID + "\t";
	}


	
}



