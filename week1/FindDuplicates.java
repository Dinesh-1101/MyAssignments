package november.week1;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,7,2,7,5,8,9,3};
		for (int i = 0; i < a.length; i++) {
			for (int j =i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println(a[j]);
				}
				
			}
		}



}
}
