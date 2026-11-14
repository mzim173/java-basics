import java.util.Scanner;
public class SmartRestorant {
	public static void main(String[]args) {
		displayMenu();
		Scanner input = new Scanner(System.in);
		int choise = input.nextInt();
		double subtotal = 0 ;
		double taxt;
		double Discount;
	while (choise != 0){
			switch (choise) {
				case 1:
					System.out.println("Enter quantity:");
					int quantity = input.nextInt();
					subtotal += quantity*50; break;
				case 2:
					System.out.println("Enter quantity:");
					quantity = input.nextInt();
					subtotal += quantity*80; break;
				case 3:
					System.out.println("Enter quantity:");
					quantity = input.nextInt();
					subtotal += quantity*45; break;
				}
				displayMenu();
				choise = input.nextInt();
			}

			taxt = calculateTax(subtotal);
			double Total_Amount = subtotal + taxt;
			Discount = applyDiscount(Total_Amount);
			Total_Amount = Total_Amount - Discount;

			System.out.println("******* FINAL INVOICE *******");
			System.out.println("Subtotal:        " + subtotal + "SAR");
			System.out.println("Tax (15%):       " + taxt + " SAR");
			System.out.println("Discount:       -" + Discount + " SAR");
			System.out.println("-----------------------------");
			System.out.println("Total Amount: " + Total_Amount + "SAR");
			System.out.println("*****************************");

		}

	public static void displayMenu(){
		System.out.println("--- Welcome to Java Restaurant ---\nMenu:");
		System.out.println("1. Burger    - 50 SAR");
		System.out.println("2. Pizza     - 80 SAR");
		System.out.println("3. Pasta     - 45 SAR");
		System.out.println("Checkout");
		System.out.println("Select item number (or 0 to finish):");
	}
	public static double calculateTax(double subtotal){
		return subtotal*0.15;
	}
	public static double applyDiscount(double Total_Amount){
		double d = 0;
		if (Total_Amount > 200) {
			d = Total_Amount*0.10;
		return d;
		}
		else { return d = 0; }
	}
}


