package assignmentsDay1.java;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
		char[] txt1 = null;
		char[] txt2 = null;
		if(text1.length() == text2.length()) {
			txt1 = text1.toCharArray();
			txt2 = text2.toCharArray();
			Arrays.sort(txt1);
			Arrays.sort(txt2);
			boolean result =Arrays.equals(txt1, txt2);
			if(result) {
				System.out.println("Arrays has same value");
			}
			else {
				System.out.println("Arrays doesnot have same value");
			}
			 
		}else {
			System.out.println("Arrays doesnot have same value");
		}
	}

}
