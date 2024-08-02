package Tuesday18624;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Student Info Portal");
		
		int ch=0;
		System.out.println("Enter Student name:");
		String name=sc.next();
		
		System.out.println("Enter Student age:");
		int age=sc.nextInt();
		
		System.out.println("Enter Student rollno:");
		int rollno=sc.nextInt();
		
		System.out.println("Enter Student div:");
		String div=sc.next();
		
		System.out.println("Enter Total subjects:");
		int ts=sc.nextInt();
		
		System.out.println("Enter Total Marks:");
		int tm=sc.nextInt();
		int avg=tm/ts;
		System.out.println("Total Average:"+avg);
		
		
		
		
		do {
			System.out.println("Press 1:Display Student info");
			System.out.println("Press 2:Total marks and Average");
			System.out.println("Press 3:Student Result");
			System.out.println("Press 4:Exit");
			System.out.println("Enter Choice");
			
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Student Info:"+ name+ age+ rollno+ div);
			break;
			case 2:
				System.out.println("Total Marks "+tm);
				
				System.out.println("Total Average"+avg);
				
			break;
			case 3:
				if(avg==100 && avg<=35){
					System.out.println("Student has passed the exam");
		
				}
				else {
					System.out.println("Student has failed.");
				}
				
			break;
			case 4:
				System.out.println("Exiting...");
			break;
			default:
				System.out.println("Wrong choice");
			}
		}while(ch!=4);

	}

}
