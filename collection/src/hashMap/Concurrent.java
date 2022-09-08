package hashMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrent {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> h=new ConcurrentHashMap<Integer,String>();
		h.put(100,"stark");
		h.put(101,"michale");
		h.put(102,"ani");
		h.put(103,"jani");
		//h.put(null, "kiki");// its throw null pointer exception because key ==null
	//	System.out.println(h);
		for(Map.Entry<Integer,String>e:h.entrySet())
			System.out.println(e.getKey() + e.getValue());
	}

}
