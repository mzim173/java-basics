import java.util.Scanner;
public class StudantGrade {
   public static void main (String[]args){
   Scanner input = new Scanner (System.in);
      System.out.println("Enter Grade");
      double a = (double)input.nextDouble();
      if (a >= 90.0) {
      System.out.println("A");
	  }
      else  if (a >= 80.0){
        System.out.println("B");
	}
	else if (a >= 70.0){
	System.out.println("C");
    }
	else if (a >= 60.0){
	System.out.println("D");
    }
	else
	System.out.println("F");

    }
}