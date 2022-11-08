package interviewjavapgm;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int number=371;
		int total=0;
		int orginal=number;
		while(number>0) {
		int remainder=number%10;
		total=total+remainder*remainder*remainder;
		number=number/10;
	}
		if(total==orginal) {
			System.out.println("The given number is ArmStrongNumber");
		}else 
		{System.out.println("The given number is not ArmStrongNumber");
	}

	}
}
