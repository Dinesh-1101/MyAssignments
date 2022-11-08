package week2.day4;

public class StringWelcome {

	public static void main(String[] args) {
		String str="welcome to chennai";
		int count=0;
		char[] charArray = str.toCharArray();   //str.c
		for (int i = 0; i < charArray.length; i++) {
		if(charArray[i]==' ') {
				count=count+1;
				
			}
			
		}
		System.out.println(count);
		
	}

}
