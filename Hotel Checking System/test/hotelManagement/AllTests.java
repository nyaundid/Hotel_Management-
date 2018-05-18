package hotelManagement;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Controller.HomeTest;
import Room.RoomTest;
import Member.MemberTest;

@RunWith(Suite.class)
@SuiteClasses({ DatabaseManagerTest.class, FrontDiskViewTest.class,
		HouseKeepingTest.class, JavaApplicationTest.class,
		RoomService.class, HomeTest.class, RoomTest.class, MemberTest.class })
public class AllTests {

}
