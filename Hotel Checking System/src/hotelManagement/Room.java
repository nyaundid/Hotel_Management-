package hotelManagement;

public class Room {
	

       //protected String mainName;
        private String mainName;
        int guestsInRoom;

        public Room() {
            mainName = "k";

        }

        public void setName(String aName) {
            //  System.out.println("add name class method ");
            mainName = aName;
        }

        public String getName() {
            return mainName;
        }
    }


