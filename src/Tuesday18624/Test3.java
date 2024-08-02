package Tuesday18624;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Arithmetic Operations");
		
		int ch=0;
		System.out.println("Enter Value for First Number: ");
		int i=sc.nextInt();
		
		System.out.println("Enter Value for Second Number:");
		int j=sc.nextInt();
		
		do {
			System.out.println("Press 1:Addition");
			System.out.println("Press 2:Subtraction");
			System.out.println("Press 3:Multiplication");
			System.out.println("Press 4:Division");
			System.out.println("Press 5:Exit");
			System.out.println("Enter Choice");
			
			ch=sc.nextInt();
			
			switch(ch){
			case 1:
				System.out.println("Addition:"+(i+j));
			break;
			case 2:
				System.out.println("subtracxtion:"+(i-j));
			break;
			case 3:
				System.out.println("Multiplication:"+(i*j));
			break;
			case4:
				System.out.println("Division"+(i/j));
			break;
			case5:
				System.out.println("Exiting...");
			break;
			default:
				System.out.println("Wrong Choice");
			}
		}while(ch!=5);
		

	}

}
