package challenge;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 98;
		 int i = 1, result = 1; 
	        if (x == 0 || x == 1) {
	            System.out.println(x); 
	        }
	        else {
	        while (result <= x) { 
	            i++; 
	            result = i * i; 
	        } 
	        System.out.println(i - 1); 
	    } 
	}
	

}
