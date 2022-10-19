package assignmentsDay2.java;

import java.util.TreeSet;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {4,3,6,8,29,1,2,4,7,8};
	TreeSet<Integer> treeset = new TreeSet<>();
	for(Integer integ : data) {
		if(!treeset.add(integ)) {
			System.out.println("Duplicate Number in Set is :" + integ);
		}
	}
		
		
	}

}
