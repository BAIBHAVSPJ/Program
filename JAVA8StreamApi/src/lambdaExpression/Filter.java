package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
	public static void main(String[] args) {
		List<Integer> num =Arrays.asList(2,3,4,5,6);
		List<Integer> square = num.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(square);
		
		List<String> names = Arrays.asList("baibhav","sandeep","niladri");
		List<String> result =names.stream().filter(s->s.startsWith("b")).collect(Collectors.toList());
		System.out.println(result);
		
		
		
	}

}
