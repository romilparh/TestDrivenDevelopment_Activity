import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTribalScreaming {

	@Test
	void testScreamName() {
		TribalScreaming s = new TribalScreaming();
		assertEquals("Peter is amazing",s.scream("Peter"));
	}
	
	@Test
	void testScreamEmptyName() {
		TribalScreaming s = new TribalScreaming();
		assertEquals("You is amazing",s.scream(""));
	}

	@Test
	void testScreamNull() {
		TribalScreaming s = new TribalScreaming();
		assertEquals("You is amazing",s.scream(null));
	}
	
	@Test
	void testScreamNameUC() {
		TribalScreaming s = new TribalScreaming();
		assertEquals("PETER IS AMAZING",s.scream("PETER"));
	}
}
