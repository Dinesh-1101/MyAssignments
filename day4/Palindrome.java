package week2.day4;

public class Palindrome {

	public static void main(String[] args) {
		String text="madam";
		String reverse="";
		char[] charArray=text.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			reverse = reverse+charArray[i];
			
			
		}
		if(text.equals(text)) {
			System.out.println("is palindrome");
			}
		else {
				System.out.println("is not a palindome");
			}
		
		
				
				
				
		// TODO Auto-generated method stub

	}

}
