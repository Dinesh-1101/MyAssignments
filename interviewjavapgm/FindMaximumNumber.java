package interviewjavapgm;

import java.util.Arrays;

public class FindMaximumNumber {
public static void main(String[] args) {
	int[] num= {3,5,8,9,54,2};
	Arrays.sort(num);
	int len=num.length;
			System.out.println(num[len-1]);
			//min
			System.out.println(num[0]);
}
}
