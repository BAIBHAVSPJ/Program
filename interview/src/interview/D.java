package interview;

public class D {
	public static void main(String[] args) {
		
		int arr[]=new int [] {1,2,3,4,5,6,7,8,9,3,2,4,6,7,9};
	//	int k=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
				System.out.println(arr[i]);
			}
			//System.out.println(arr[i]);
		}
	}

}
