package Thursday20624;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array:");
	
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter elements of the array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
