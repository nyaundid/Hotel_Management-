package hotelManagement;

import java.util.HashMap;
public class minibar {
	private static HashMap <String, inroomdinning> MBList;
	public minibar ()
	{
		MBList = new HashMap <String, inroomdinning>();
		MBList.put("MNBR", new inroomdinning ("MNBR"));
		MBList.put("MBR", new inroomdinning ("MBR"));
		
			
	}
		

	


	public static inroomdinning fetchCopy(String mBID) {
		// TODO Auto-generated method stub
		return MBList.get(mBID);
	}


}




