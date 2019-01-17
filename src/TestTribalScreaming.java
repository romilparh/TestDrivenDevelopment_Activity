import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTribalScreaming {
	
	@Test
	void testScreamMoreNames() {
		TribalScreaming s = new TribalScreaming();
		String [] names = {"Peter","Aditya","Satya"};
		  System.out.println(s.scream(names));
		assertEquals("Peter, Aditya, and Satya are amazing",s.scream(names));
	}
	
	@Test
	void testScreamTwoNames() {
		TribalScreaming s = new TribalScreaming();
		String [] names = {"Peter","Satya"};
		  System.out.println(s.scream(names));
		assertEquals("Peter and Satya are amazing",s.scream(names));
	}

	@Test
	void testScreamNull() {
		TribalScreaming s = new TribalScreaming();
		  System.out.println(s.scream(null));
		assertEquals("You is amazing",s.scream(null));
	}
	
	@Test
	void testScreamEmptyName() {
		TribalScreaming s = new TribalScreaming();
		String [] name = {""};
		  System.out.println(s.scream(name));
		assertEquals("You is amazing",s.scream(name));
	}

	
	@Test
	void testScreamOneName() {
		  TribalScreaming s = new TribalScreaming();
		  String [] name = {"Romil"};
		  System.out.println(s.scream(name));
		  assertEquals("Romil is amazing",s.scream(name));
		}
	
	@Test
	void testScreamOneCapitalName() {
		  TribalScreaming s = new TribalScreaming();
		  String [] name = {"ROMIL"};
		  System.out.println(s.scream(name));
		  assertEquals("ROMIL IS AMAZING",s.scream(name));
		}
	
	@Test
	void testScreamTwoCapitalNames() {
		  TribalScreaming s = new TribalScreaming();
		  String [] name = {"ROMIL","PETER"};
		  System.out.println(s.scream(name));
		  assertEquals("ROMIL AND PETER ARE AMAZING",s.scream(name));
		}
	
	@Test
	void testScreamMoreCapitalNames() {
		  TribalScreaming s = new TribalScreaming();
		  String [] name = {"ROMIL","PETER","JIGISHA"};
		  System.out.println(s.scream(name));
		  assertEquals("ROMIL, PETER, AND JIGISHA ARE AMAZING",s.scream(name));
		}
	
	@Test
	void testScreamOneComboName() {
		  TribalScreaming s = new TribalScreaming();
		  String [] name = {"ROMIL","Peter"};
		  System.out.println(s.scream(name));
		  assertEquals("Peter is amazing. ROMIL ALSO!",s.scream(name));
		}
	
	@Test
	void testScreamMoreComboName() {
		  TribalScreaming s = new TribalScreaming();
		  String [] name = {"ROMIL","Peter","PRITESH","Jenelle","ROHIT","Albert"};
		  System.out.println(s.scream(name));
		  assertEquals("Peter, Jenelle, and Albert are amazing. ROMIL, PRITESH, AND ROHIT ALSO!",s.scream(name));
		}
	@Test
	void testScreamTwoComboName() {
		  TribalScreaming s = new TribalScreaming();
		  String [] name = {"ROMIL","Peter","PRITESH","Jenelle"};
		  System.out.println(s.scream(name));
		  assertEquals("Peter and Jenelle are amazing. ROMIL AND PRITESH ALSO!",s.scream(name));
		}
}
