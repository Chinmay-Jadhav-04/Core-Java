package Wednesday19624;

import java.util.Scanner;

public class Test1 {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of lines:");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++) {
			for(int j=1;j<=no-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
		}
			System.out.println();
		}
	}

}

