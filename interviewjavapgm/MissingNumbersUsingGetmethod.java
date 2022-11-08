package interviewjavapgm;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumbersUsingGetmethod{
public static void main(String[] args) {
	
	int[] num = {4,6,7,2,3,1,5,10,8,8,6};
	
	Set<Integer> number = new TreeSet<Integer>();
	for (int i = 0; i < num.length; i++) {
		number.add(num[i]);
	}
	System.out.println(number);
	List<Integer> numb = new ArrayList<Integer>(number);
	for (int i = 0; i <=numb.size(); i++) {
		if (numb.get(i+1) != numb.get(i)+1) {
			
		    System.out.println(numb.get(i)+1);
		    break;
		
	}
	}
}

}
