package p1;

public class I {
	public static void main(String[] args) {
		String s1="testing time runnnnnnn";
		String temp=null;
		String[] s2= s1.split(" ");
		if(s2[0].length()>s2[1].length() && s2[0].length()>s2[2].length()) {
			temp=s2[0];
			
		}
		if(s2[1].length()>s2[0].length() && s2[1].length()>s2[2].length()) {
			temp=s2[1];
			
		}
		if(s2[2].length()>s2[0].length() && s2[2].length()>s2[1].length()) {
			temp=s2[2];
			
		}
		if(temp!=null) {
			System.out.println(temp);
		}
		else {
			System.out.println("many word with same size");
		}
	}

}
