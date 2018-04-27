package hotelManagement;

public class GoldMember extends Member {
	// private int membershipPoints;
	    
	    GoldMember(char pMemberType, int pMemberID, String pName, double pFees){
	        super(pMemberType, pMemberID, pName, pFees);
	        
	    }

//	    public void setMembershipPoints(int pMembershipPoints){
//	        membershipPoints = pMembershipPoints;
//	    }
//	    
//	    public int getMembershipPoints()
//	    {
//	        return membershipPoints;
//	    }
	    
	    @Override
	    public String toString(){
	        return super.toString();
	    }  
	    
	}
