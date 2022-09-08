package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashProgram {
	public static void main(String[] args) {
		HashMap<String,String> hash=new HashMap<>();
		hash.put("vishal", "mathur");
		hash.put("baibhav","kumar");
		hash.put("sandeep", "gupta");
		System.out.println(hash);
		System.out.println(hash.size());
		for(Map.Entry<String,String>e:hash.entrySet())
			//hash.put("Bik", "bikbik");
			System.out.println("Key:" + e.getKey() +  "value:" +e.getValue());
	
	}

}
