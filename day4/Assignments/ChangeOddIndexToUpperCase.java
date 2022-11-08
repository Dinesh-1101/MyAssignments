package week2.day4.Assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test="changeme";
		char[] charArray=test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (i%10==0) {
				System.out.println(test.toUpperCase());
			} else {
				System.out.println(test);
			}
		}

	}

}
