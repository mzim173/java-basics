import java.util.Scanner;
public class Number {
    public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Number");
		int number = input.nextInt();
		if (number >= 0){
			System.out.println("Positive Number");
	}
        else{
			System.out.println("Negative Number");
		}
	}

	}
