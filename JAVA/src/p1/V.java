package p1;

import java.util.ArrayList;
import java.util.Collections;

public class V { 

//comparable
	public static void main(String[] args) {
		
		ArrayList<Emp>	emps =new ArrayList<>();
		 
		
		emps.add(new Emp("Aurgesh","9481481752",1));
    	emps.add(new Emp("rikesh","7483855698",2));
		emps.add(new Emp("Bmesh","9934257167",3));
		Collections.sort(emps ,new IdComparator());
		//comparable
		System.out.println(emps );
		ArrayList<Emp>emps1=new ArrayList< >(emps);
		Collections.sort(emps1,new NameComparator());
		System.out.println(emps1);
		
		
	}

}
