package p1;

public class B extends A {
	public static void display() {
		System.out.println("Teacher teaches student");
	}
	
	public static void observe() {
		System.out.println("student are good1");
	}

	public static void main(String[] args) {
		A a1 = new B();
		//a1.observe();
		B b1 =new B();
		b1.observe();
		b1.display();
		//b1.display();
		a1.observe();
		//a1.display();
		B.display();
		A.observe();
		
	}
	

}
