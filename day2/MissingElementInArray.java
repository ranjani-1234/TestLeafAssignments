package week1.day2;

public class MissingElementInArray {

	
	public static int missingNumber(int[] arr)
    {
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int restSum=0;
        for (int i = 0; i < arr.length; i++) {
            restSum+=arr[i];
        }
        int missingNumber=sum-restSum;
        return missingNumber;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int[] arr = {1,2,3,4,7,6,8};

				missingNumber(arr);
				System.out.println("Missing ELement is : " + missingNumber(arr));
	}

}
