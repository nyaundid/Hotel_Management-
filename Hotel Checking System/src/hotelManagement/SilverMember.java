package hotelManagement;

public class SilverMember extends Member{
    
   // private int club;
    
    SilverMember(char pMemberType, int pMemberID, String pName, double pFees){
        super(pMemberType, pMemberID, pName, pFees);
        
    }

//    public void setClub(int pClub){
//        club = pClub;
//    }
//    
//    public int getClub(){
//        return club;
//    }
    
    @Override
    public String toString(){
        return super.toString();
    }

    
}

