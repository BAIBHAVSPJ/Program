package p1;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner Sc =new Scanner(System.in);
		int n,arm=0,rem,c;
		System.out.println("print the number");
		n=Sc.nextInt();
		
		c=n;
		while(n>0) {
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==arm) {
			System.out.println("arm no");
		}else {
			System.out.println("no arm");
		}
		
	}

}
