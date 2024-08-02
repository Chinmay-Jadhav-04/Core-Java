import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String name=sc.nextLine();
			
		System.out.println("Enter Employee Salary per day:");
		int salary=sc.nextInt();
		
		System.out.println("Enter Employee attendance in this momnth");
		int attend=sc.nextInt();
		
		int total=salary*attend;
				System.out.println("Total Salary:"+total);
		 
		if (total>100000) {
			System.out.println("He is Senior Manager");
		}
		else if(total<=90000 && total>=80000) {
			System.out.println("He is in marketing team");
		}
		else if(total<=80000 && total>=70000) {
			System.out.println("He is in Sales team");
		}
		else if(total<=70000 && total>=40000) {
			System.out.println("He is in IT Team");
		}
		else {
			System.out.println("He is an Intern");
		}

	}

}
