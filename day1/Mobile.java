/**
 * 
 */
package week1.day1;


public class Mobile {

	
	public void makeCall() {
		String mobileModel = "Iphone";
		float mobileWeight = 1.090f;
		System.out.println("Mobile Model: " + mobileModel);
		System.out.println("Weight: " + mobileWeight);
	}
	
	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 60000;
		System.out.println("Fully Charged: " + isFullCharged);
		System.out.println("Mobile Price: " + mobileCost);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile m = new Mobile();
		System.out.println("This is my mobile");
		m.makeCall();
		m.sendMsg();
	}

	
}
