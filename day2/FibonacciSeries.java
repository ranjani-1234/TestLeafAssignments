package week1.day2;

public class FibonacciSeries {

	int n1=0,n2=1,n3=0; 
	static int range=8, firstNum=0, secNum=1,sum;
	static void printFibonacci(int range){
		if(range >0) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(" "+sum);
			printFibonacci(range-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(firstNum + " " + secNum);
		printFibonacci(range-2);
	}

}

//initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

		// Print first number		
		// Iterate from 1 to the range
		// add first and second number assign to sum
		// Assign second number to the first number
		// Assign sum to the second number
		// print sum
