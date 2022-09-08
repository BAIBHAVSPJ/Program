package hashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedHashMap {
	public static void main(String[] args) {
		try {
			Map<String,String>hmap=new HashMap<String,String>();
			hmap.put("1", "welcome");
			hmap.put("2", "to");
			hmap.put("3", "samastipur");
			hmap.put("4", "ha");
			hmap.put("5", "ha");
			Map<String,String>smap=Collections.synchronizedMap(hmap);
			System.out.println(smap);
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}
	}

}
