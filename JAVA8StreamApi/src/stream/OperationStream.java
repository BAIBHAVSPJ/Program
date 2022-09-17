package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OperationStream {
	public static void main(String[] args) {
		
	List<Employee> employeeList = new ArrayList<Employee>();
	
	employeeList.add(new Employee(113,"jaya",32,"female","HR",2011,25000.0));
	employeeList.add(new Employee(112,"Daya",31,"male","HR1",2001,20000.0));
	employeeList.add(new Employee(111,"maya",30,"female","HR2",2021,26000.0));
	employeeList.add(new Employee(110,"laya",32,"female","HR3",2022,25500.0));
	
	Optional<Employee> emp=employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
	System.out.println(emp);
	List<Employee>sortedlist = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
    System.out.println(sortedlist);
    //arrange in ascending order
    
    List<Employee> desc =employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
    
    System.out.println(desc);
    
    //i want list of employee whose salary more than 10000
    
    List<Employee> emax = employeeList.stream().filter(e->e.getSalary()>25000).collect(Collectors.toList());
    System.out.println(emax);
    
   
}
}
