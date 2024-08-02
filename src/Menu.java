import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter MenuName:");
	String menuName=sc.nextLine();
	
	System.out.println("Enter Quantity:");
	int qty=sc.nextInt();
	
	System.out.println("Enter Price:");
	int price=sc.nextInt();
	
	System.out.println("MenuName:"+menuName+"\nMenu quantity:"+qty+"\nMenu price:"+price);

	}

}
