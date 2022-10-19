package assignmentsDay2.java;

import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = { 5, 7, 8, 1, 2, 3, 4, 3, 9, 10 };
		LinkedHashSet<Integer> values= new LinkedHashSet<>(Arrays.asList(arr));	
		System.out.println("Afrer Removing Duplicate values:" + values);
		TreeSet  sorted = new TreeSet(values);
		System.out.println("After Sorting ascending order: " + sorted);

		
		System.out.println("Missing number is: " );
	}

}
/*
 * Problem 
 * 
 * There will be running number between 1 to 10
 * One of the unique number will be missing
 * Find the missing number
 * 
 * 
 */

/*
 * Psuedocode
 * 
 * a) Remove the duplicates using Set
 * b) Make sure the set is in the ascending order
 * c) Iterate from the starting number and verify the next number is + 1
 * d) If did not match, that is the number
 * 
 */