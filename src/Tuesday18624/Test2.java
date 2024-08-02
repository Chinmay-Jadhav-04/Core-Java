package Tuesday18624;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		
		int i=sc.nextInt();
		int j=1;
		while(j<=10)
		{
			System.out.println(i+"X"+j+"="+(i*j));
			j++;
		}
		

	}

}
