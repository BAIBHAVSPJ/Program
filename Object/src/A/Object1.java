package A;

public class Object1 { //By the use of new instance method
	String str="hello";
	public static void main(String[] args) {
		
		try {
			Object1 a1= Object1.class.newInstance();
			System.out.println(a1.str);
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
