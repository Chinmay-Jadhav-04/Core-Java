package Tuesday18624;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number or rows:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int space=2*(row-i);space>=0;space--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
