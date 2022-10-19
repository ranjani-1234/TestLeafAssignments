package assignmentsDay1.java;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "madam";
		String rev= "";
			for(int i=(value.length()-1);i>=0;i--) {
				rev = rev + value.charAt(i);
				
		}
			if(rev.equals(value))
				System.out.println("Given string is palindrome");
			else
				System.out.println("Given string is not a palindrome");
	}

}

