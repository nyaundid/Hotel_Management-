package Member;

public class Member {
	 	public String memberType;
	    public String confirmationNo;
	    public String name;
	    public String roomNo;

	    
	    //new empty constructor 
	    public Member (){
	    	
	    }
	    //new constructor 
	    Member (String memberType, String confirmationNo, String name, int roomNo){
	    	
	    }
	    
	    Member(String pMemberType, String pconfirmationNo, String pName){
	    
	        memberType = pMemberType;
	        confirmationNo = pconfirmationNo;
	        name = pName; 
	    }

	    public void setMemberType(String pMemberType)
	    {
	        memberType = pMemberType;
	    }
	    
	    
	    public String getMemberType()
	    {
	        return memberType;
	    }
	    
	    public void setconfirmationNo(String pconfirmationNo)
	    {
	        confirmationNo = pconfirmationNo;
	    }
	    
	    public String getconfirmationNo()
	    {
	        return confirmationNo;
	    }
	    
	     public void setName(String pName)
	    {
	        name = pName;
	    }
	    
	    public String getName()
	    {
	        return name;
	    }
	    
//	    public void setFees(double pFees)
//	    {
//	        fees = pFees;
//	    }
//	    
//	    public double getFees()
//	    {
//	        return fees;
//	    }

	    @Override
	    public String toString(){
	       return memberType + ", " + confirmationNo + ", " + name;
	    }

		

	}