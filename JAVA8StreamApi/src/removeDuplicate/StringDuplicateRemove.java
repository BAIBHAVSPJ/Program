package removeDuplicate;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringDuplicateRemove {
	public static void main(String[] args) {
		String orignalString = "world world";

		String output = Arrays.asList(orignalString.split(""))
								.stream()
								.distinct()
								.collect(Collectors.joining());

		System.out.println("Original String : " + orignalString);
		System.out.println("After removing the duplicates : " + output);
		
	}

}
