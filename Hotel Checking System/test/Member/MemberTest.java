package Member;

import static org.junit.Assert.*;

import org.junit.Test;

public class MemberTest {
	Member m = new Member("Bini", "LL22", "S", 1);
	@Test
	public void testMember() {
		Member m = new Member("Bini", "LL22", "S");
		m.setMemberType("S");
		Member m1 = new Member();
		
		
	}

	@Test
	public void testGetMemberType() {
		m.getMemberType();
	}

	@Test
	public void testSetconfirmationNo() {
		m.setconfirmationNo("LL22");
	}

	@Test
	public void testGetconfirmationNo() {
		m.getconfirmationNo();
	}

	@Test
	public void testSetName() {
		m.setName(null);
	}

	@Test
	public void testGetName() {
		m.getName();
	}

	@Test
	public void testToString() {
		m.toString();
	}
}
