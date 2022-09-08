package arrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class Arraytest {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("mango");
		list.add("apple");
		list.add("grapes");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			list.set(1,"banana");
			//list.add("banana");//concurrentModificationException
			System.out.println(itr.next());
		}
	}

}
