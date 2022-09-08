package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {
		ArrayList<Integer> nlist=new ArrayList<>(Arrays.asList(1,1,1,2,2,2,3,4,5,6,5,46,45,46,45,48));
		System.out.println(nlist);
		System.out.println("After removing duplicate element");
		List<Integer> lwd=nlist.stream().distinct().collect(Collectors.toList());
		System.out.println(lwd);
	}

}