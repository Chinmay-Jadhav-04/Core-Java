package Thursday20624;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size for row:");
        
		int row=sc.nextInt();
		System.out.println("Enter the size for column:");
		
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("Enter array elements:");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
