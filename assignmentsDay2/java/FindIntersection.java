package assignmentsDay2.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		
		List<Integer> num1 = new ArrayList<>();
		List<Integer> num2 = new ArrayList<>();
		List<Integer> same = new ArrayList<>();
		for(int i =0;i<a.length;i++) {
			num1.add(a[i]);	
			}
		for(int j =0;j<b.length;j++) {
			num2.add(b[j]);	
			}
		System.out.println("List1 : "+num1);
		System.out.println("List2 : " + num2);
		 num1.retainAll(num2);
		 	 System.out.println("Using Retain All : "+num1);
		 	 
		 	for(Integer i : num1){
		        if(num2.contains(i)){
		            same.add(i);                
		        }
		    }
		 	 System.out.println("Using Nested Loop: " +same);

	}

}
/*
 * Pseudo Code
 *input: int[] a={3,2,11,4,6,7};
 *        int[] b={1,2,8,4,9,7};
 *output:2,4,7

 * c) create a two empty Lists - list1 & list2
 * c) Declare for loop iterator from 0 to array a.length and add into list1
 * d) Declare for loop iterator from 0 to array b.length and add into another list2
 * e) Compare Both list1 & list2 using a nested for loop
 *    1)Print the matching number
 *  
 */