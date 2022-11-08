package interviewjavapgm;

import java.util.Arrays;

public class AddingTwoArray {
public static void main(String[] args) {
	int[] a= {10,20,30,40,50};
	int[] b= {60,70};
	int len=a.length+b.length;
	int[] c=new int[len];
	
	for (int i = 0; i < a.length; i++) {
		c[i]=a[i];
		
	}
	int j=0;
	for (int i = a.length; i < c.length; i++) {
		c[i]=b[j];
		j++;
	}
String string = Arrays.toString(c);
System.out.println(string);
}
}
