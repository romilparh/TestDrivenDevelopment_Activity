import java.util.ArrayList;

public class TribalScreaming {
	
	// Some Static Strings commonly used
	public static String connectorAnd = " and ";
	public static String connectorAndMore = "and ";
	public static String you = "You";
	public static String isAmazing = " is amazing";
	public static String areAmazing = " are amazing";
	public static String isAmazingUC = " IS AMAZING";
	public static String areAmazingUC = " ARE AMAZING";
	public static String fullStop = ". ";
	public static String connectorAndUC = " AND ";
	public static String connectorAndUCMore = "AND ";
	public static String alsoUC = " ALSO!";
	public static String comma = ", ";

	/* Cases:
	 * 1. Input String Array is null
	 * 2. Input String array has empty value only
	 * 3. No UpperCase Value (1 or more)
	 * 4. No LowerCase Value (1 or more)
	 * 5. Both UpperCase and LowerCase Values (1 or more)
	 * 
	 * I added one input type for TWO OR MORE UPPER CASED NAMES, I HAVE ADDED TEST CASES FOR THAT OUTPUT AS WELL
	 */
	public String scream(String[] name) {
		// nameString and upperNameString to save the names
		String nameString = "";
		String upperNameString = "";
		String fullOutput ="";

		// 1. Input String Array is NULL --- WORKING
		if(name == null) {
			return you+isAmazing;
		}
		// 1. END
		else {
			// Sort the names according to the cases
			String [] upperNames = upperCaseSort(name); // uppercases and lowercases mixed
			String [] lowerNames = lowerCaseSort(name) ; // if all upper cases 
			
			// Case Number 2: Input String array has empty value only
			if(lowerNames.length == 0 && upperNames.length == 0) {
				return you+isAmazing;
			}
			// 2.END

			else {
				// 3. No UpperCase Value (1 or more) --- WORKING
				if(upperNames.length == 0) {
					return returnLowerString(lowerNames);
				}// 3. END
				// 4. No LowerCase Value (1 or more) --- WORKING	
				 else if (lowerNames.length == 0) {
					return returnUpperString(upperNames);
				}
				// 4. END 
				// 5. Both UpperCase and LowerCase Values (1 or more)
				else {

					fullOutput = fullOutput.concat(returnLowerString(lowerNames));
					fullOutput = fullOutput.concat(fullStop);
					fullOutput = fullOutput.concat(returnUpperStringAlso(upperNames));
          			return fullOutput;
			}
			// 5. END
		}
	}
}

	// Function to return string for lower or mixed cased names
	public String returnLowerString(String[] lowerNames){
		String nameString = "";
		if(lowerNames.length==1) {
						return lowerNames[0] + isAmazing;
					} else if(lowerNames.length==2){
						for(int i=0;i<lowerNames.length;i++) {
							if(i == 0) {
					             nameString = nameString.concat(lowerNames[i]);
					           } else if(i== lowerNames.length -1 ){
					             nameString = nameString.concat(this.connectorAnd + lowerNames[i]);
					           }
						}
						return nameString+areAmazing;
					} else {
						for(int i=0;i<lowerNames.length;i++) {
							if(i == 0) {
					             nameString = nameString.concat(lowerNames[i]);
					           } else if(i== lowerNames.length -1 ){
					             nameString = nameString.concat(this.comma+this.connectorAndMore + lowerNames[i]);
					           } else {
					             nameString = nameString.concat(this.comma+  lowerNames[i]);
					           }
						}
						return nameString+areAmazing;
					}
	}

	// Function to return string only for upper cased names when no lower and mixed cased names are there 
	public String returnUpperString(String[] upperNames){
		String nameString = "";
		if(upperNames.length==1) {
						return upperNames[0] + isAmazingUC;
					} else if(upperNames.length==2){
						for(int i=0;i<upperNames.length;i++) {
							if(i == 0) {
					             nameString = nameString.concat(upperNames[i]);
					           } else if(i== upperNames.length -1 ){
					             nameString = nameString.concat(this.connectorAndUC + upperNames[i]);
					           }
						}
						return nameString+areAmazingUC;
					} else {
						for(int i=0;i<upperNames.length;i++) {
							if(i == 0) {
					             nameString = nameString.concat(upperNames[i]);
					           } else if(i== upperNames.length -1 ){
					             nameString = nameString.concat(this.comma+this.connectorAndUCMore + upperNames[i]);
					           } else {
					             nameString = nameString.concat(this.comma+ upperNames[i]);
					           }
						}
						return nameString+areAmazingUC;
					}
	}

	// Function to return upper cased string for combination input for upper case and lower/mix cased names
	public String returnUpperStringAlso(String[] upperNames){
		String nameString = "";
		if(upperNames.length==1) {
						return upperNames[0] + alsoUC;
					} else if(upperNames.length==2){
						for(int i=0;i<upperNames.length;i++) {
							if(i == 0) {
					             nameString = nameString.concat(upperNames[i]);
					           } else if(i== upperNames.length -1 ){
					             nameString = nameString.concat(this.connectorAndUC + upperNames[i]);
					           }
						}
						return nameString+alsoUC;
					} else {
						for(int i=0;i<upperNames.length;i++) {
							if(i == 0) {
					             nameString = nameString.concat(upperNames[i]);
					           } else if(i== upperNames.length -1 ){
					             nameString = nameString.concat(this.comma+this.connectorAndUCMore + upperNames[i]);
					           } else {
					             nameString = nameString.concat(this.comma+ upperNames[i]);
					           }
						}
						return nameString+alsoUC;
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
	
	// Function to sort names with one or more lowercase letters and return string array
	public String [] lowerCaseSort(String []name) {
		ArrayList<String> nameList = new ArrayList<String>();
		for(int i=0;i<name.length;i++) {
			if(!isUpperCase(name[i])) {
				nameList.add(name[i]);
			}
		}
		String[] nameArray = nameList.toArray(new String[nameList.size()]);
		return nameArray;
	}
	
	// Function to sort names with only uppercase letters and return string array
	public String [] upperCaseSort(String []name) {
		ArrayList<String> nameList = new ArrayList<String>();
		for(int i=0;i<name.length;i++) {
			if(isUpperCase(name[i])) {
				if(name[i]=="") {
					continue;
				}else {
					nameList.add(name[i]);
				}
				
			}
		}
		String[] nameArray = nameList.toArray(new String[nameList.size()]);
		return nameArray;
	}
	
}
