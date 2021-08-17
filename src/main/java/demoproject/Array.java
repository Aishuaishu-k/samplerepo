package demoproject;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,67,89};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		sum+=arr[i];
		}
		System.out.println("displaysum"+sum);
		System.out.println("Array length"+arr.length);

	}

}
