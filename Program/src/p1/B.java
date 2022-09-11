package p1;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		int num,i ,count=0;
		Scanner sc =new Scanner(System.in);
		num=sc.nextInt();
		for(i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("prime number");
		}else {
			System.out.println("not prime number");
		}
	}

}
