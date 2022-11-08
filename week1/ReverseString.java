package november.week1;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Dinesh";
		char[] newversion = name.toCharArray();
		for (int i = newversion.length-1; i >=0; i--) {
			System.out.println(newversion[i]);
		}

	}

}
