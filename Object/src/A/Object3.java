package A;

public class Object3 implements Cloneable{//Object.clone() method
	
	protected java.lang.Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	String str="hello world";
	public static void main(String[] args) {
		Object3 a1= new Object3();
		try {
			Object3 a2=(Object3)a1.clone();
			System.out.println(a1.str);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
