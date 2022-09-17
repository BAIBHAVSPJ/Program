package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Company {
	public static void main(String[] args) {
		ProjectTeam p1 =new ProjectTeam("Baibhav",20,"m","IT");
		ProjectTeam p2 =new ProjectTeam("Sandeep",22,"m","HR");
		ProjectTeam p3 =new ProjectTeam("yashu",24,"f","HR");
		ProjectTeam p4 =new ProjectTeam("anuyshka",23,"f","IT");
		ProjectTeam p5 =new ProjectTeam("nil",20,"m","IT");
		
		
		List<ProjectTeam> pt = Arrays.asList(p1,p2,p3,p4,p5);
		pt.stream().filter(e->e.getAge()>20 && e.getGender().equals("f") ).
		map(e->e.getGender().startsWith("m")).
		collect(Collectors.toList()).forEach(System.out::println);
		Map<String, Double> gp = pt.stream().collect(Collectors.groupingBy(ProjectTeam::getGender,Collectors.averagingInt(ProjectTeam::getAge)));
		System.out.println(gp);
		//Map<String, Long> js=pt.stream().collect(Collectors.groupingBy(ProjectTeam::Department,Collectors.counting()));
		Map<String, Long> coll = pt.stream().collect(Collectors.groupingBy(ProjectTeam::getDepartment, Collectors.counting()));
		System.out.println(coll);
		Map<String, Long> collect = pt.stream().collect(Collectors.groupingBy(ProjectTeam::getGender,Collectors.counting()));
		System.out.println(collect);
	}
	

}
