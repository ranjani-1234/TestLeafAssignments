package assignmentsDay1.java;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ;
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String rtext = "";
		String textxt[] = text.split(" ");
			for(int i=0;i<=textxt.length;i++) {
				for(int j=i+1;j<textxt.length;j++) {
					if(textxt[i].equals(textxt[j])) {
						count++;
						textxt[j]="";
						if(count>1) {
							textxt[j]="";
						}
						
					}
				}
			}
				for(String word: textxt) {
					rtext = rtext + word + " ";
					}
	        
		
			System.out.println("\nSentence after removing duplicate words: " + rtext);
	}

}
