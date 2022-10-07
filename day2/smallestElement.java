package week1.day2;

public class smallestElement {

	public static void main(String[] args) {
		int arr[]={23,45,67,32,89,22};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
				System.out.println("Second smallest number is: " + arr[1]);
			
		}
	}

