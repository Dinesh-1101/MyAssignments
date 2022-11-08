package interviewjavapgm;

public class SumOfDigit {
public static void main(String[] args) {
	int num=1235;
	int sum=0;
	while (num>0) {
	int remainder=num%10;
	sum=sum+remainder;
	// 0=0+5
	//5=0+5
	System.out.println(sum);
	num=num/10;
	//1235=1235/10
	//123.5=1235/10
}System.out.println(sum);
}
}
