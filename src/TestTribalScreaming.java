import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTribalScreaming {

	@Test
	void testScream() {
		TribalScreaming s = new TribalScreaming();
		assertEquals("Peter is amazing",s.scream("Peter"));
	}

}
