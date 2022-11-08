package week2.day2;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Fibonacci {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int sum;
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 0; i <10 ; i++) {
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
			System.out.println(sum);		
		}
		// TODO Auto-generated method stub

	}

}
