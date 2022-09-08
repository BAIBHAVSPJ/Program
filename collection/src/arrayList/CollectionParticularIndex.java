package arrayList;

import java.util.ArrayList;
import java.util.Vector;

public class CollectionParticularIndex {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Baibhav");
		a.add("Ankit");
		a.add("Sandeep");
		a.add("JaiDeep");
		System.out.println(a);
		Vector<String> b=new Vector<>();
		b.add("jack");
		b.add("mack");
		a.addAll(2,b);
		System.out.println(a);
	}

}
