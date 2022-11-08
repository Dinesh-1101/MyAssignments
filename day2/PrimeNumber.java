package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=13;
		int count=0;
		
		for (int i = 1; i <=13; i++) {
			if(input%i==0) {
				count++;
				
			}
		}
		if(count==2) {
			System.out.println("the given number is prime");
		}else {
			System.out.println("the given number is not prime");
		}
		
		
		
		
		
	
		}

	}


