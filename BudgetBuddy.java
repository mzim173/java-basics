import java.util.Scanner;
public class Budget_Buddy {
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your total monthly budget:");
		double total_monthly_budget = input.nextDouble();
		double totalexpenses = 0;
		double warning_line = total_monthly_budget * .10;
		double reminder_balance;

		System.out.println("---Welcom to BudgetBuddy---");
		System.out.println("Enter your expenses one by one");
		System.out.println("Type 0 at any time to stop and exit.");
		System.out.println("-----------------------------------");

		System.out.println("Enter expense amount:");
		double correntExpense = input.nextDouble();
		while (correntExpense != 0) {


			totalexpenses += correntExpense;
			reminder_balance = total_monthly_budget - totalexpenses;
			System.out.println("Current remaining balance: $" + reminder_balance);
			if (reminder_balance < 0){
				System.out.println("DANGER: YOU HAVE EXCEEDED YOUR BUDGET! (Negative Balance)");
			}
			else if (reminder_balance <= warning_line){
				System.out.println("WARNING: YOUR BALANCE IS BELOW 10% OF YOUR ORIGINAL BUDGET!");
			}
			System.out.println("-----------------------------------");
			System.out.println("Enter expense amount:");
			correntExpense = input.nextDouble();
		}
		reminder_balance = total_monthly_budget - totalexpenses;
		System.out.println("======= FINAL BUDGET SUMMARY =======");
		System.out.println("Total Monthly Budget: $" + total_monthly_budget);
		System.out.println("Total Expenses Logged: $" + totalexpenses);
		System.out.println("Final Remaining Balance: $" + reminder_balance);
		System.out.println("====================================");
	}
}