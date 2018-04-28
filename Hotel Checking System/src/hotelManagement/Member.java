package hotelManagement;

public class Member {
	 char memberType;
	    int confirmationNo;
	    String name;
	    double fees;
	    
	    Member(char pMemberType, int pconfirmationNo, String pName, double pFees){
	    
	        memberType = pMemberType;
	        confirmationNo = pconfirmationNo;
	        name = pName;
	        fees = pFees;               
	    }

	    public void setMemberType(char pMemberType)
	    {
	        memberType = pMemberType;
	    }
	    
	    
	    public char getMemberType()
	    {
	        return memberType;
	    }
	    
	    public void setconfirmationNo(int pconfirmationNo)
	    {
	        confirmationNo = pconfirmationNo;
	    }
	    
	    public int getconfirmationNo()
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
	    
	    public void setFees(double pFees)
	    {
	        fees = pFees;
	    }
	    
	    public double getFees()
	    {
	        return fees;
	    }

	    @Override
	    public String toString(){
	       return memberType + ", " + confirmationNo + ", " + name + ", " + fees;
	    }

		

	}