package p1;

public class F {
	public static void main(String[] args) {
		int [] [] x=new int[2][2];
		x[0][0]=10;
		x[0][1]=20;
		x[1][0]=30;
		x[1][1]=40;
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[0].length;j++) {
				System.out.println(x[i][j]);
			}
		}
	}

}
