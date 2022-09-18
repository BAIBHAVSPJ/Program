package removeDuplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class A {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>(Arrays.asList(1,10,1,2,2,3,10,3,3,4,5,5));
		System.out.println(list);
		List<Integer> rm = list.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(rm);
		
		Set<Integer> setwithoutDuplicates = list.stream().collect(Collectors.toSet());
		System.out.println(setwithoutDuplicates);
		System.out.println("hashset");
		Set<Integer> set = new HashSet();
		list.stream().filter(n->!set.add(n)).forEach(System.out::println);
		
		
		System.out.println("reverse order");
		list.stream().distinct().sorted(Collections.reverseOrder()).forEach(System.out::println);
	
		
	}

}
