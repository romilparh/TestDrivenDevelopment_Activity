
public class TribalScreaming {

	public String scream(String name) {
		if(name == null) {
			return "You is amazing";
		}
		else if(name.length()<1){
			return "You is amazing";
		}
		else if(isUpperCase(name)){
			return name + " IS AMAZING";
		}
		else {
			return name + " is amazing";
		}
	}
	
	// FUNCTION TO CHECK IF STRING IS UPPERCASED OR NOT
	public static boolean isUpperCase(String s)
	{
	    for (int i=0; i<s.length(); i++)
	    {
	        if (!Character.isUpperCase(s.charAt(i)))
	        {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static void main(String ar[]) {
		TribalScreaming s = new TribalScreaming();
		System.out.print(s.scream("PETER"));
	}
}
