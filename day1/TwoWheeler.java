package week1.day1;

public class TwoWheeler {
	int noOfWheeles=2;
	short noOfMirrors=4;
	long chassIsNumber=1234567890L;
	boolean isPunctred=false;
	String bikeName="bullet";
	double runningKm=87654.3455;
	

	public static void main(String[] args) {
		TwoWheeler bike=new TwoWheeler(); 
		System.out.println(bike.noOfWheeles);
		System.out.println(bike.noOfMirrors);
		System.out.println(bike.chassIsNumber);
		System.out.println(bike.isPunctred);
		System.out.println(bike.bikeName);
		System.out.println(bike.runningKm);
	}

}
