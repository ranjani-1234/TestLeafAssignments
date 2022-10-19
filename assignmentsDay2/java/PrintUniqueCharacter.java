package assignmentsDay2.java;

import java.util.HashSet;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String name = "ranjani";
 char[] ch = name.toCharArray();
 System.out.println(ch);
 HashSet hashset = new HashSet();

 for(char c : name.toCharArray()){
     if(hashset.contains(c)) {
     }
     hashset.add(c);
     
 }
 System.out.println(hashset);

	}

}