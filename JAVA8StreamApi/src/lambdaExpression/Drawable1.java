package lambdaExpression;

public class Drawable1 implements Drawable {
	public static void main(String[] args) {
		int width=10;
		
		
		Drawable1 a1=new Drawable1();
		System.out.println(width);
		a1.draw();
		System.out.println(width);
		
	}

	@Override
	public void draw() {
		System.out.println(500);
		
	}
	

}
