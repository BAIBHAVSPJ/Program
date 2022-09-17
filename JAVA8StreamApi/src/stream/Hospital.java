package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {
	public static void main(String[] args) {
		Patient p1=new Patient("p1",20,"fever",18000);
		Patient p2=new Patient("p2",25,"corona",28000);
		Patient p3=new Patient("p3",30,"corona",38000);
		Patient p4=new Patient("p4",60,"corona",88000);
		
		List<Patient> pat = Arrays.asList(p1,p2,p3,p4);
		pat.stream().filter(e -> e.getDisease().equals("corona") && e.getAge() <60).map(e->e.getAmount()+500).forEach(System.out::println);
		Double averageBillPaid =pat.stream().filter(e->e.getDisease().equals("corona")).collect(Collectors.averagingDouble(Patient::getAmount));
		System.out.println(averageBillPaid);
	}

}
