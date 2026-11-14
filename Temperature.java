import java.util.Scanner;
public class Temperature {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Is the temperature with celsius or fahrenhayt ?");
		System.out.print("Enter 1 to change from celsius to fahrenhayt");
		System.out.print("Enter 2 to change from fahrenheit to celsius");
		int x = input.nextInt();
		if (x == 1){
			System.out.print("Enter temperature : ");
			double celsius = input.nextDouble();
			double fahrenhayt =(celsius * 1.8) + 32;
			System.out.println("temperature with fahrenhayt is : " + fahrenhayt);
		}
		else if (x == 2){
			System.out.print("Enter temperature : ");
			double fahrenhayt = input.nextDouble();
			double celsius = (5.0/9) * (fahrenhayt - 32);
			System.out.println("temperature with celsius is : " + celsius);
		}
		else {

	}
}