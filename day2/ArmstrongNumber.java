package week1.day2;

public class ArmstrongNumber {
	

	public static void main(String[] args) {
		int input=153;
		int num=0;
		
		while(input>0) {
		int remainder=input%10;
	
		
		num=num+(remainder*remainder*remainder);
		input=input/10;
		}
		System.out.println(num);

		
		
	}

}
