package november.week1;

public class Fibanocci {

	public static void main(String[] args) {
		int firstnum=0;
		int secnum=1;
		int sum=0;
		
		System.out.println(firstnum);
		System.out.println(secnum);
		for (int i = 1; i <=8; i++) {
			sum=firstnum+secnum;
			firstnum=secnum;
			secnum=sum;
			System.out.println(sum);
		}

	}

}
