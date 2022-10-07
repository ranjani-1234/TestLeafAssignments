package week1.day2;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = -40;
		int initialNumber = number;
		if(number<0) {
			number = (number < 0 ? -number : number);
			System.out.println("The number " + initialNumber +" is coverted to " + number);
		}
		else 
			System.out.println("The number is "+ number);
	

	int num = 35;
	if (num<0)  
		System.out.println(num + "  is Negative value");
	
	else if(num > 0) 
		System.out.println(num + "  is Positive value");
	
	else
		System.out.println(num + " is Neither negative nor positive");
}
}