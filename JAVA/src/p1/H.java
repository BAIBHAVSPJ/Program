package p1;

public class H {
	public static void main(String[] args) {
		String s1= "timeing testing";
		String[] s2= s1.split(" ");
		System.out.println(s1.length());
		String temp=null;
		if(s2[0].length()>s2[1].length()) {
			temp=s2[0];
		}
		if(s2[1].length()>s2[0].length()) {
			temp=s2[1];
		}
		if(temp!=null) {
			System.out.println(temp);
		}
		else {
			System.out.println("many word with same size");
		}
	}

}
