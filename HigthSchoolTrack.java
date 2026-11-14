import java.util.Scanner;
public class HigthSchoolTrack{
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		System.out.println("Select your High School Track:");
		System.out.println("(1)Literary Track");
		System.out.println("(2)Scientific Track");
		int choise = input.nextInt();

		System.out.println("Enter your High School Percentage:");
		int hsp =input.nextInt();
		System.out.println("Enter your English test score (0-100):");
		int eg = input.nextInt();

		if (hsp < 70){
			System.out.println("Admission Result : ");
            System.out.println("Assigned College : Not accepted in any track");
		}
		else {
			if (choise == 1){
				if (hsp >= 85 && eg >= 75){
					System.out.println("Admission Result : ");
					System.out.println("Assigned College : Faculty of languages and Translation");
					if (hsp >= 95){
						System.out.println("Scholarship Type: Full Schoolarship(100% of tuition covered)");
					}
					if (hsp >= 90 && hsp < 95){
						System.out.println("Scholarship Type: Partial Schoolarship(70% of tuition covered)");
					}
					if (hsp >= 85 && hsp < 90){
						System.out.println("Scholarship Type: Partial Schoolarship(50% of tuition covered)");
					}
				}
				else {
					System.out.println("Admission Result : ");
                    System.out.println("Assigned College : Not accepted in any track");
				}
			}
			else if (choise == 2){
				if (hsp >= 90 && eg >= 70){
					System.out.println("Admission Result : ");
					System.out.println("Assigned College : Faculty of Engineering");
										if (hsp >= 95){
											System.out.println("Scholarship Type: Full Schoolarship(100% of tuition covered)");
										}
										if (hsp >= 90 && hsp < 95){
											System.out.println("Scholarship Type: Partial Schoolarship(70% of tuition covered)");
										}
										if (hsp >= 85 && hsp < 90){
											System.out.println("Scholarship Type: Partial Schoolarship(50% of tuition covered)");
										}
									}
				else {
					System.out.println("Admission Result : \nAssigned College : Not accepted in any track");\
				}
			}
		}
	}
}