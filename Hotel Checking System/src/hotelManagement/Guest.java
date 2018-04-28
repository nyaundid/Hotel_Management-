package hotelManagement;

public class Guest {

		 private String name; 
		 private int number;
		 private Room room; 
		 private String membertype;
		  
		 
		 public Guest(String name) { 
		  this.name = name; 
		 } 
		  
		 public Number getNumber(int number) {
			 return this.number = number;
		 }
		 
		 public String getName() { 
		  return name; 
		 } 
		  
		 
		 public Room getRoom() { 
		  return room; 
		 } 
		  
		 
		 public boolean checkin(Room r) { 
		  if (r.getGuest() == null) { 
		   r.setGuest(this); 
		   this.room = r; 
		   return true; 
		  } 
		  return false; 
		 } 
		  
		 
		 
		 
		 
		 public boolean checkout() { 
		  if (this.room != null && this.room.getGuest() == this) { 
		   this.room.setGuest(null); 
		   this.room = null; 
		   return true; 
		  } 
		  return false; 
		 } 
		  
		 
		 public String toString() { 
		  return "Guest" + name + number; 
		 }

		public String getMembertype() {
			return membertype;
		}

		public void setMembertype(String membertype) {
			this.membertype = membertype;
		} 
		  
		}
	
	
	
	
	

