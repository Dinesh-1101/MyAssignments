package week5.day5;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text="We learn java basics as part of java session in java week1";
		String[] split=text.split(" ");
		Set<String> removeduplicates=new LinkedHashSet<String>();
		for (int i = 0; i < split.length; i++) {
			removeduplicates.add(split[i]);
		}
		System.out.println(removeduplicates);

	}

}
