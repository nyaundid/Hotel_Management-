package hotelManagement;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Controller.HomeTest;

@RunWith(Suite.class)
@SuiteClasses({ DatabaseManagerTest.class, FrontDiskViewTest.class,
		HouseKeepingTest.class, JavaApplicationTest.class,
		RoomServiceTest.class, HomeTest.class })
public class AllTests {

}
