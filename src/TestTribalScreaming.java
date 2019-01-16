import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTribalScreaming {

	@Test
	void testScreamTwoNames() {
		TribalScreaming s = new TribalScreaming();
		String [] names = {"Peter","Aditya"};
		assertEquals("Peter and Aditya are amazing",s.scream(names));
	}
	
	@Test
	void testScreamMoreNames() {
		TribalScreaming s = new TribalScreaming();
		String [] names = {"Peter","Aditya","Satya"};
		assertEquals("Peter, Aditya and Satya are amazing",s.scream(names));
	}

	@Test
	void testScreamNull() {
		TribalScreaming s = new TribalScreaming();
		assertEquals("You is amazing",s.scream(null));
	}
	
	@Test
	void testScreamEmptyName() {
		  TribalScreaming s = new TribalScreaming();
		  String [] name = {""};
		  assertEquals("You is amazing",s.scream(name));
		}
	
	@Test
	void testScreamOneName() {
		  TribalScreaming s = new TribalScreaming();
		  String [] name = {"Romil"};
		  assertEquals("Romil is amazing",s.scream(name));
		}
}
