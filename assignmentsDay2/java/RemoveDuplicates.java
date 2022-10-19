package assignmentsDay2.java;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String name ="PayPal India";
 char[] txt1 = null;
 txt1 = name.toCharArray();
 Set<char[]> charSet = new HashSet<char[]>();
 Set<char[]> dupCharSet = new HashSet<char[]>();
 Set<Character> encounteredChars = new HashSet<Character>();
 boolean mustAdd = true;
 
 for (Character element : txt1) { 
	 if(encounteredChars.contains(element)) {
		 mustAdd = false;
	 }
	 
	 if(!mustAdd) {
		 dupCharSet.add(txt1);
		 mustAdd = true;
	 }
	 else {
		 encounteredChars.add(element);
	 }
	}
 
 System.out.println(txt1);
System.out.println(dupCharSet);
System.out.println(encounteredChars);
	}
}
//Declare a String as PayPal India
//Convert it into a character array
//Declare a Set as charSet for Character
//Declare a Set as dupCharSet for duplicate Character
//Iterate character array and add it into charSet

//if the character is already in the charSet then, add it to the dupCharSet

//Check the dupCharSet elements and remove those in the charSet

//Iterate using charSet

//Check the iterator variable isn't equals to an empty space

//print it
