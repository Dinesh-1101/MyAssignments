package interviewjavapgm;

public class SwappingMethodsWithoutTemp {
public static void main(String[] args) {
	int a=10;
	int b=20;
	a=a+b;
	b=a-b; //30-20
	System.out.println("b="+b);
	a=a-b;
	System.out.println("a="+a);
}
}
