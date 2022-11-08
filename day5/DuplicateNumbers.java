package week5.day5;		

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int[] data= {4,3,6,8,29,1,2,4,7,8};
		
		Set<Integer> success=new LinkedHashSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			if (!success.add(data[i])) {
				System.out.println(data[i]);
			}
			
			
		}

	}

}
