package Friday21624;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		String city ="Mumbai";
		System.out.println(city);
		System.out.println(city.length());
		System.out.println(city.charAt(2));
		city="pune";
		System.out.println(city);
		
		System.out.println(city.toUpperCase());
		System.out.println(city.toLowerCase());
		
		String fName="jhon";
		String lName="Dao";
		System.out.println(fName+lName);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Username:");
		String uName=sc.next();
		System.out.println("Enter your Password:");
		String pass=sc.next();
				
		if(uName.equals("admin")&&pass.equals("admin")) {
			System.out.println("Login Done!!!!");
			
		}
		else {
			System.out.println("Failed!!!!!!");
		}
	   

	}

}
