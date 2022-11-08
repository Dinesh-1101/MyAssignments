package week7.day3;

public class NumberOfWors {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String num="Koushik is a good boy";
		int count=0;
		String[] num2=num.split(" ");
		for (int i = 0; i < num2.length; i++) {
			count++;
		}
		System.out.println(count);
}
}