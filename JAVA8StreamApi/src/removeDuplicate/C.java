package removeDuplicate;

import java.util.Arrays;
import java.util.List;

public class C {
	public static void main(String[] args) {
		List<Integer> ml =Arrays.asList(10,15,8,49,25,98,32);
		ml.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
	}

}
