import java.util.Scanner;
public class Dive {
	public static void main (String[]args){
	Scanner input = new Scanner (System.in);
	System.out.println("Enter Number");
	int num = input.nextInt();

	if (num % 2 == 0 && num % 3 == 0){
	System.out.println("divisable by 2 and 3 ? true");
}
	else
	System.out.println("divisable by 2 and 3 ? false");

    if (num % 2 == 0 || num % 3 == 0){
		System.out.println("divisable by 2 or 3 ? true");
	}
		else
		System.out.println("divisable by 2 or 3 ? false");


}
}