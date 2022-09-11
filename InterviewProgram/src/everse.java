import java.util.Scanner;

public class everse {
	public static void main(String[] args) {
		int i,n;
		String s;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string");
		s=sc.nextLine();
		char[] str=s.toCharArray();
		n=str.length;
		System.out.println("reverse the string is");
		for( i=n-1;i>=0;i--) {
			System.out.print(str[i]);
		}
	}

}
