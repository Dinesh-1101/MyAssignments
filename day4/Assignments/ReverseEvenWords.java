package week2.day4.Assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test="I am a software tester";
		String[] split=test.split(" ");
		String convert="";
		for (int i = 0; i < split.length; i++) {
			if (i%10!=0) {
				char[] charArray=split[i].toCharArray();
				String rev="";
				for (int j = charArray.length-1; j >=0 ; j--) {
					rev=rev+charArray[j];
					convert=convert+" "+rev;
					
				}
				
			
				
			} else {
				convert=convert+" "+split[i];


			}
			
		}
		System.out.println(convert);
		

	}

}

