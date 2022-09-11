package p1;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {3,60,40,30,5,9,45};
		int temp=0;
		int n=arr.length;
		int flag=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-1);i++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					flag=1;
				}
				
				
			}
			if(flag==0) {
				break;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		
		
	}
	

}
