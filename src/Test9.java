import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Emter Name:");
		String name=s.nextLine();
		
		System.out.println("Enter Age:");
		int age=s.nextInt();
		
		if (age>=18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are underage Nigga");
		}
	}

}
