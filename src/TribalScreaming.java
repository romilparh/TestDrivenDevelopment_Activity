
public class TribalScreaming {
	
	public static String connector = ", ";
	public static String connectorAnd = " and ";

	public String scream(String[] name) {
		if(name == null) {
			return "You is amazing";
		} else {
			String nameString = "";
			if(name.length == 2) {
				for(int i=0;i<name.length;i++) {
					if(i ==0) {
						nameString = nameString.concat(name[i]);
					} else {
						nameString = nameString.concat(this.connectorAnd + name[i]);
					}
				}
				System.out.println(nameString + " are amazing");
				return nameString + " are amazing";
			} else {
				return "";
			}
			
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
	
}
