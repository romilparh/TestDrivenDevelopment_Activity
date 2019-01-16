
public class TribalScreaming {

	public String scream(String name) {
		if(name == null) {
			return "You is amazing";
		}
		else if(name.length()<1){
			return "You is amazing";
		}
		else {
			return name + " is amazing";
		}
	}
	
	public static void main(String ar[]) {
		TribalScreaming s = new TribalScreaming();
		System.out.print(s.scream(null));
	}
}
