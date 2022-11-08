package november.week1;

public class PrintDuplicatesInTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] hi= {1,0,2,9,3,6,7,};
		int[] bye= {0,1,9,2,8,3,4,8,65,6};
		for (int i = 0; i < hi.length; i++) {
			for (int j = 0; j < bye.length; j++) {
				if (hi[i]==bye[j]) {
					System.out.println(bye[j]);
				}
			}
		}

	}

}
