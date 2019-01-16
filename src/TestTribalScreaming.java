import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTribalScreaming {

	@Test
	void testScreamName() {
		TribalScreaming s = new TribalScreaming();
		String [] names = {"Peter","Aditya"};
		assertEquals("Peter and Aditya are amazing",s.scream(names));
	}

	@Test
	void testScreamNull() {
		TribalScreaming s = new TribalScreaming();
		assertEquals("You is amazing",s.scream(null));
	}
	
}
