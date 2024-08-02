import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		
		System.out.println("Enter first Number:");
		int num=s.nextInt();
		
		
		if (num>=0)
		{
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is negative");
		}

	}

}
