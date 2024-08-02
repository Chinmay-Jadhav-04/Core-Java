import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice");
		int ch= sc.nextInt();
		 switch(ch){
			 case1:
				 System.out.println("Sunday");
			 break;
			 case2:
				 System.out.println("Monday");
			 break;
			 case3:
				 System.out.println("Tuesday");
			 break;
			 case4:
				 System.out.println("Wednesday");
			 break;
			 case5:
				 System.out.println("Thursday");
			 break;
			 case6:
				 System.out.println("Friday");
			 break;
			 case7:
				 System.out.println("Saturday");
			 break;
			 default:
				 System.out.println("Wrong Choice");
		 }

	}


