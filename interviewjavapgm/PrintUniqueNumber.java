package interviewjavapgm;

import java.util.Arrays;

public class PrintUniqueNumber {
public static void main(String[] args) {
	int[] num= {1,3,5,6,7,8,2,4,3,5,6,7,7};
	//duplicate 3,5,6,7
	//unique value1,2,3,4,5,6,7,8
	Arrays.sort(num);
	for (int i = 0; i < num.length; i++) {
		for (int j = i+1; j < num.length; j++) {
			if(num[i]==num[j]) {
				num[j]=1000;
			}
		}
		if(num[i]!=1000) {
			System.out.print(num[i]);
		}
	}
}
}
