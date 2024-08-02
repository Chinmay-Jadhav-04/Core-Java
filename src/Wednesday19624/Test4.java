package Wednesday19624;

import java.util.Scanner;

public class Test4 {
	static void pattern(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=i+1;j<=num;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows for a:");
		a=sc.nextInt();
		System.out.println("Enter rows for b:");
		b=sc.nextInt();
		System.out.println("Enter rows for c:");
		c=sc.nextInt();
		pattern(a);
		pattern(b);
		pattern(c);

	}

}
