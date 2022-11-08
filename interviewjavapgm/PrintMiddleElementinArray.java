package interviewjavapgm;

import java.util.Arrays;

public class PrintMiddleElementinArray {
public static void main(String[] args) {
	int[] num1= {1,2,4,5,6,7,8};
	String string = Arrays.toString(num1);
	//System.out.println(Arrays.toString(mida);
	
	  int arr[] = {10, 11, 12, 13, 15, 18, 20};
	    int num = (arr.length) / 2;
	    if (num % 2 == 0) {
	        for (int i = (num - 1); i <= num; i++) {
	            System.out.println(arr[i]);
	        }
	    } else {
	        System.out.println(arr[num]);
	    }
}
}
