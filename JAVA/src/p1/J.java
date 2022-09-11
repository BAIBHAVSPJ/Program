package p1;

public class J {
	static String reverse=" ";
	static String temp=null;
	public static void main(String[] args) {
		String s1="run time call";
		String []s2=s1.split(" ");
		if(s2[0].equals("run")){
			for(int i=s2[0].length()-1;i>=0;i--) {
				reverse=reverse+ s2[0].charAt(i);
				
			}
			temp= reverse+" "+s2[1]+" "+s2[2];
			
			
		}
		if(s2[1].equals("run")) {
			for(int i=s2[1].length()-1;i>=0;i--) {
				reverse=reverse+s2[1].charAt(i);
				
			}
			temp=s2[0]+" "+reverse+" "+s2[2];
			
		}
		if(s2[2].equals("run")) {
			for(int i=s2[2].length()-1;i>=0;i--) {
				reverse=reverse+s2[2].charAt(i);
				
			}
			temp=s2[0]+" "+s2[1]+" "+reverse;
			
		}
		System.out.println(temp);
	}


}
