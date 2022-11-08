package interviewjavapgm;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateUsingSet {
public static void main(String[] args) {
	int[] number= {1,4,5,6,7,8,3,2,1};
	
	Set<Integer> val=new TreeSet<Integer>();
	for (Integer integer : number) {
		if(!val.add(integer)) {
			val.add(integer);
			System.out.println(integer);
		}
		
	}
	
	
}
}
