package p3;

public class B {
	public static void observe() {
		System.out.println("student are good");
	}

}
public class C extends B{
	public static void display() {
		System.out.println("Teacher teaches student");
	}
	public static void main(String[] args) {
		B b1=new C();
		b1.observe();
	}
}
