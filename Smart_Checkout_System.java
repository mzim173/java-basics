import java.util.Scanner;
public class Smart_Checkout_System {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("WELCOME TO JAVA SMART STORE");
		System.out.println("Please enter your name:");
		String custem_name = input.next().toUpperCase();
		double subtotal = 0;
		char user_selection;
		double discount = 0;
		double tax = 0;
		double total = 0;
		do {
			displayMenu();
				int user_choise = input.nextInt();
					switch (user_choise){
						case 1:
							subtotal += 25.5;
						System.out.println("Item added. Current subtotal: $" + subtotal); break;
						case 2:
							subtotal += 75.00;
						System.out.println("Item added. Current subtotal: $" + subtotal); break;
						case 3:
							subtotal += 15.25;
						System.out.println("Item added. Current subtotal: $" + subtotal); break;
						default :
						System.out.println("Invalid selection! Please try again.");
						}
							System.out.println("Do you want to add another item? (y/n):");
							user_selection =input.next().charAt(0);
			}while (user_selection == 'y');


			System.out.println("Enter promo code (Type 'NONE' if you don't have one):");
			String promo_code = input.next().toUpperCase();


			if (promo_code.equals("SAVE10")){
				discount = subtotal * 0.10;
				System.out.println("Promo code applied! You saved 10%.");
			} else { discount = 0; }
			double sub_after_dis = subtotal - discount;

			tax = taxamount(sub_after_dis);
			total = sub_after_dis + tax;
			total = Math.round(total * 100.0) / 100.0;
			Receipt(custem_name, subtotal, discount, total, tax);
		}




	public static void displayMenu (){
		System.out.println("--- AVAILABLE PRODUCTS ---");
		System.out.println("1. Wireless Mouse   - $25.50");
		System.out.println("2. Mechanical Keyboard - $75.00");
		System.out.println("3. USB-C Hub        - $15.25");
		System.out.println("Enter the item number (1-3):");
	}

	public static double taxamount (double sub_after_dis){
			return sub_after_dis * 0.05;
		}

	public static void Receipt(String custem_name, double subtotal, double discount, double total, double tax){
		System.out.println("------------------------------------");
		System.out.println("OFFICIAL RECEIPT");
		System.out.println("Customer: " + custem_name);
		System.out.println("Subtotal: $" + subtotal);
		System.out.println("Discount: -$" + discount);
		System.out.println("Tax (5%): +$" + tax);
		System.out.println("------------------------------------");
		System.out.println("TOTAL AMOUNT: $" + total);
		System.out.println("------------------------------------");
		System.out.println("Thank you for shopping with us!");
	}
}