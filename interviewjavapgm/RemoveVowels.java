package interviewjavapgm;

public class RemoveVowels {
public static void main(String[] args) {
	String text="testleaf";//aeiou 
	//output tstlf
	char[] charArray = text.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		if(charArray[i]=='a'||charArray[i]=='e'||charArray[i]=='i'|| 
				charArray[i]=='o'||
				charArray[i]=='u') {
			System.out.print(charArray[i]);
		}
		else {
			System.out.print(charArray[i]);
		}
	String replaceAll = text.replaceAll("[^aeiou]", "");
	//System.out.println(replaceAll);
	}

}
}