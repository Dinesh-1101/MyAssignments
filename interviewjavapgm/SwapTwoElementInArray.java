package interviewjavapgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapTwoElementInArray {
public static void main(String[] args) {
	List<String> name=new ArrayList<String>();
	Collections.addAll(name, "Aravind","Ram","Saheel","Easwar");
	System.out.println(name);
	
	Collections.swap(name, 0, 2);
	System.out.println(name);
}
}
