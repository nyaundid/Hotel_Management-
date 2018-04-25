package hotelManagement;

public class HouseKeeping {		

private String ROOMID;
private Patron ROOM;

public HouseKeeping (String R)
{
	ROOMID=R;
}

public String getROOMID() {
	return ROOMID;
}

public void setROOMTo(Patron p)
{
	ROOM=p;
}

public Patron getROOMTo()
{
	return ROOM;
}

public String toString()
{
	return "\t Copy id:" + ROOMID + "\t";
}
}

