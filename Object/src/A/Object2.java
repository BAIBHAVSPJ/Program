package A;

import java.lang.reflect.Constructor;

public class Object2 {//new instance method() of constructor class
	
	String str="hello1";
	public static void main(String[] args) {
		try {
			Constructor<Object2> a1= Object2.class.getConstructor();
			Object2 a2= a1.newInstance();
			System.out.println(a2.str);
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
