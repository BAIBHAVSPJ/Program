package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoCollection {
	public static void main(String[] args) {
		ArrayList<String> ListA=new ArrayList<>(Arrays.asList("a","b","c"));
		ArrayList<String> ListB=new ArrayList<>(Arrays.asList("a","b","c"));
		Collections.sort(ListA);
		Collections.sort(ListB);
		
		boolean a =ListA.equals(ListB);
		System.out.println(a);
		
	}

}
