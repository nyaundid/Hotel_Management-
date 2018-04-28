// Room class

package hotelManagement;

public class Room {
	

       //protected String mainName;
	   
        
        @SuppressWarnings("unused")
		private int guestsInRoom;
        @SuppressWarnings("unused")
		private Guest guest;
        
        private int number;
		private boolean clean;

        public Room(int no) {
            guestsInRoom = no;

     }
        
        
        public  Room(int no, boolean clean) {
            
            this.clean = clean;
        }
        
        public int getNumber() {
        return number;
        
}
        
        public boolean getClean() {
            return clean; 
        }

        @SuppressWarnings("hiding")
		public <guest> void setGuest(guest g) {
            guest = (hotelManagement.Guest) g; 
        } 
        

        public String getName() {
            return getName();
        }

		public Object getStatus() {
			// TODO Auto-generated method stub
			return null;
		}


		public void setName(String roomName) {
			// TODO Auto-generated method stub
			
		}


		public Object getGuest() {
			// TODO Auto-generated method stub
			return null;
		}
    }


