
public class TribalScreaming {
	
	public static String connector = ", ";
	public static String connectorAnd = " and ";
	public static String you = "You";

	public String scream(String[] name) {
		if(name == null) {
			return "You is amazing";
		} else {
			String nameString = "";
				for(int i=0;i<name.length;i++) {
					if(name[i]=="") {
						if(i == 0) {
							nameString = nameString.concat(you);
						} else if(i== name.length -1 ){
							nameString = nameString.concat(this.connectorAnd + you);
						} else {
							nameString = nameString.concat(this.connector + you);
						}
					} else {
						if(i == 0) {
							nameString = nameString.concat(name[i]);
						} else if(i== name.length -1 ){
							nameString = nameString.concat(this.connectorAnd + name[i]);
						} else {
							nameString = nameString.concat(this.connector + name[i]);
						}
					}
				}
				if(name.length == 1) {
					return nameString + " is amazing";
				} else {
					return nameString + " are amazing";
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
