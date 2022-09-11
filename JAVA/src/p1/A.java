package p1;

public class A {
	public static void main(String[] args) {
		int n=2  ,arm=0,rem,c;
		//Scanner sc =new Scanner(System.in);
		//System.out.println("enter your number");
		//n=sc.nextInt();
		c=n;
		while(n>0) {
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==n) {
			System.out.println("Armonstrom number");
		}
		else {
			System.out.println("not armongstrom number");
		}
		
	}

}
