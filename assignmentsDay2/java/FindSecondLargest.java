package assignmentsDay2.java;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		TreeSet output = new TreeSet();
		
		for(int i=0;i<data.length;i++) {
			output.add(data[i]);
		}
		//System.out.println(output);
		List arr = new ArrayList(output);
		System.out.println("Second largest number is:" + arr.get(arr.size()-2));
		
	}

}
