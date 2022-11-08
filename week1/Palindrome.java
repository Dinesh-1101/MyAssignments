package november.week1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pen="Malayalm";
		String rev="";
		char[] cat = pen.toCharArray();
		for (int i = cat.length-1; i > 0; i--) {
			rev=rev+cat[i];
		}
		if (pen.equalsIgnoreCase(rev)) {
			System.out.println("is palindrome");
		}else {
			System.out.println("not  a palindrome");
		}
		

	}

}
