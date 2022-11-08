package interviewjavapgm;

public class CharacterOccuranceInWord {
public static void main(String[] args) {

	String str = "welcome to chennai";
	int count =0;
	
		char ch='e';
	 
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if(charAt==ch) {
				count++;
			}
		}System.out.println(count);
	
}
}
