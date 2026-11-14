import java.util.Scanner;
public class AgeInDays{
public static void main (String[]args){
Scanner input = new Scanner(System.in);
System.out.println("Enter age");
int ageinyears =input.nextInt();
int ageindays= ageinyears*365;

System.out.println( ageinyears + " years = " + ageindays + " days");

}
}

