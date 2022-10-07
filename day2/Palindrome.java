package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num = 34343;
 int temp,rnum=0;
 int remainder;
 temp=num;
 for(;num != 0;num=num/10)   
 {  
  remainder = num % 10;  
 rnum = rnum * 10 + remainder;    
 }
 if(temp == rnum) {
	 System.out.println("It is a palindrome number");
 }
 else
	 System.out.println("Not a Palindrome number");
		
	}

}
