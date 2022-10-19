package challenge;

public class dayonelastwordLength {

	public  void lastWordLen(String s) {
		int len=0;
		String s1= s.trim();
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)== ' ')
				len=0;
			else
				len++;
		}
		System.out.println(len);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dayonelastwordLength length = new dayonelastwordLength();
		length.lastWordLen("Hello World");
		length.lastWordLen(" fly me  to the moon ");
		length.lastWordLen("luffy is still joyboy");
		
}

}
