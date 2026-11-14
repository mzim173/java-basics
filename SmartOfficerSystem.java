import java.util.Scanner;
public class SmartOfficerSystem {
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Base Salary:");  //ادخل الراتب الشهري
		double salary = input.nextInt();
		 salary = Math.max(salary, 4000);
		System.out.println("Enter Years of Experience:"); //ادخل عدد سنوات الخبرة
		double hq = input.nextInt();
        	double hqprize = salary * hq / 100;
	    System.out.println("Enter Job Level (M: Manager, S: Supervisor, J: Junior):");     //المستوى الوظيفي
		char job_lvl = input.next().charAt(0);
		job_lvl = Character.toUpperCase(job_lvl);
		double job_lvl_bons;
		switch (job_lvl){
			case 'M' : job_lvl_bons = salary * 0.20 ; break;
			case 'S' : job_lvl_bons = salary * 0.20 ; break;
			case 'J' : job_lvl_bons = salary * 0.20 ; break;
			default : job_lvl_bons = 0;
		}
		double job_lvl_Rank = (double) job_lvl;   // تحويل الرمز الى رقم في ascci
		double final_Salary = salary + hqprize + job_lvl_bons ;
		System.out.println("--- Analysis Results ---");     //الراتب النهائي
		System.out.println("Final Calculate Salary: " + final_Salary);
		System.out.println("Level Code (ASCII): " + job_lvl_Rank);
		System.out.println("Enter number of years to forecast incentives: ");
		int yfi = input.nextInt();
		int i;	int c;   int x = 0;
		for (i = 1; i <= yfi; i++){
			for (c = 1; c <= 4; c++){
				 x = x + 50;
			}
			System.out.println("End of Year " + i + "Accumulated Incentives =" +  x);
		}
		System.out.println("Enter number of months for attendance record:");
		int attendance_record = input.nextInt();
		int k;
		for (k = 1; k <= attendance_record; k++){
			System.out.println("Month [" + k + "]:Great job!");
		}
	}
}
