package p1;

public class E {//PALLINDROM
	public static void main(String[] args) {
		String s1="madam";
		int j=s1.length()-1;
		int size=s1.length()-1;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==s1.charAt(j)) {
				--j;
				if(i==size) {
					System.out.println("pallindrom");
				}
				
			}
			else {
				System.out.println("there is not pallindron");
				 break;
			}
		}
		
	}

}
