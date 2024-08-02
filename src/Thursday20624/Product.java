package Thursday20624;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		int ch=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer name:");
		String name=sc.next();
		System.out.println("Enter Product name");
		String pname=sc.next();
		System.out.println("Enter Product Id");
		int pid=sc.nextInt();
		System.out.println("Enter Product Price");
		int price=sc.nextInt();
		System.out.println("enter Quantity:");
		int qty=sc.nextInt();
		
		int bill=qty*price;
		
		do {
			System.out.println("Press 1:Customer Name:");
			System.out.println("Press 2:Product Details");
			System.out.println("Press 3:Customer Bill");
			System.out.println("Press 4:Exit");
			System.out.println("Enter Choice");
			
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Customer Name:" +name);
				break;
			case 2:
				System.out.println("Product Details:"+"\npname:"+pname+"\npid:"+pid+"\nprice:"+price);
				break;
			case 3:
				System.out.println("Customer Bill:" +bill);
				break;
			case 4:
				System.out.println("Exiting....");
				break;
			default:
				System.out.println("Wrong Choice");
			}
		}while(ch!=4);
		
		

	}

}
