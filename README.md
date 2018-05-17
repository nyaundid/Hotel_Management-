# Vikings


##Description 
=================

•This is the final sprint for the third team project

•We envisioned, designed and developed  a Hotel Checking system (HCS)

•Hotel employees may use this system to facilitate the check-in process of their guests, with membership-based priority. 

•This system is flexible to support varying business rules, a few user interface mechanisms (Front Desk, Housekeeping, and Reservation Services) and integration with third party systems 

•We followed the Unified Process


##SYSTEM FEATURES
=================

•System designed for hotel operations. 

•Guests will be checked in by the FrontDesk (worker) who will coordinate with housekeeping  (worker) to insure the rooms are cleaned and ready for occupancy through the system.

•RoomService will check minibar in room and enter minibar status in system as well. 

•Once rooms are cleaned and minibar restocked, FrontDeskwill check each Guest club-status (gold, silver or none-member) and assign rooms by priority. 

•If the room is not clean the Guest will have to wait based on priority status. There will be interactions between the <<Patrons>> <<FrontDesk>> <<RoomService>>and <<housekeeping>>. 

•There is also an interface allowing users <<Patron>> <<FrontDesk>> <<RoomService>>and <<housekeeping>> to interact with each other

##USE CASE 1
=================

Patron Check In Room

##USE CASE 1
=================

Patron Check Out Room

##RUNNING THE APPLICATION
=================

•Hotel CheckInSystem SuDuses mySqldatabase called HotelManagementDB and this database has four tables: 
	
	•Member
	
	•Room
	
	•RoomStatusHK
	
	•RoomStatusRS
	
•Step 1:Place the URL “http://35.173.198.1/phpmyadmin” CMSDB (CreateDBScript) in to your browser.

•Step 2:Enter a UserNameand a new PassWordof database admin.

•Step 3:Run JavaApplication. 

•Step 4:Home screen Select option 1 Front Desk, 2 House Keeping, 3 In Room Service -1 Quit Application

•Step 5:Select option 1 Front Desk, and employee at front desk will be able to Option 1 Print rooms report 
Option 2 Print available rooms and Option 3 for Check-in Option -1 to go back to the Home Screen

•Step 6:Select option 3 for Check-in Option, the user asked to enter the confirmation number followed by Patron’s name, 
Membership Type [Gold, Silver and Non Member] next the user will be prompted to enter the room number (If the room is not vacant the system will notify the user that the room is not vacant)

•Step 7:If the user selects option 2 from the Home Scree which is House Keeping, the following options will be available. 
The user will be able to 1 Print Room List and 2 Update Room Statusand -1 to return to Home Screen.

•Step 8:If the user selects option 3 from the Home Scree which is In Room Service, the following options will be available.

#### 0.0.1
- This is an update to the version history.
- Version history should be thoroughly updated and correspond to project tags.

#### 0.0.0
- This is the first piece of version information.
