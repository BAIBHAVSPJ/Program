package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrder {
	public static void main(String[] args) {
		ArrayList<Integer> as= new ArrayList<Integer>();
		as.add(1);
		as.add(2);
		as.add(3);
		as.add(4);
		as.add(5);
		Collections.sort(as,Collections.reverseOrder());
		System.out.println(as);
	}

}
