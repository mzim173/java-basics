import java.util.Scanner;

public class Md{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);


        System.out.println("Enter branches number : ");
        int branches_num = input.nextInt();


        System.out.println("Enter Day number : ");
        int days_num = input.nextInt();

        double[][] com = new double [branches_num][days_num];


        String[] days = new String[days_num];

        for (int i = 0; i < com.length; i++){

            for (int j = 0; j < com[i].length; j++){
                System.out.println("Enter branch " + i + " incom in day " + j + " : ");     //incom throw days
                double sales = input.nextDouble();
                com[i][j] = sales;
            }
        }


        int z = 1;
        System.out.print("Branch ID      ");

        for (int i = 0; i < days.length; i++){
            System.out.print("        Day " + z++);
        }


        System.out.println("  \t\tTotal Seles        Average (Daily Sales)");

        for (int i = 0; i < com.length; i++){
            double avarage = 0;
            double total_sales = 0;

            System.out.print(i + "    \t\t");

            for (int j = 0; j < com[i].length; j++){

                System.out.print("       " + com[i][j]);
                total_sales += com[i][j];


            }
            avarage = (double)total_sales/days_num;

            System.out.print("               " + total_sales + "               " + avarage);
            System.out.println();

        }


        double[] hS = new double[com[0].length];
        double[] lS = new double[com[0].length];
        double[] dA = new double[com[0].length];
        String[] status = new String[com[0].length];


        for (int i = 0; i < com[0].length; i++){
            double higth_Score = com[0][i];                                    //higthest score
            double low_Score= com[0][i];
            double aVg = 0;

            for (int j = 0; j < com.length; j++){
                if (higth_Score < com[j][i]){
                    higth_Score = com[j][i];
                }
                hS[i] = higth_Score;
                if (low_Score > com[j][i]){
                    low_Score = com[j][i];
                }
                lS[i] = low_Score;


                aVg = (higth_Score + low_Score) / 2;
                dA[i] = aVg;

                if (aVg >= 1600){ status[i] = "Excellent";}
                else if (aVg >= 1200){ status[i] = "Good";}
                else{ status[i] = "Poor";}
            }
        }
        System.out.print("High Sales      ");
        for (int i = 0; i < hS.length ; i++){System.out.print(" \t" + hS[i] + " ");}
        System.out.print("\nLow Sales      ");
        for (int i = 0; i < lS.length ; i++){System.out.print(" \t" + lS[i] + " ");}
        System.out.print("\nAvarage Sales  ");
        for (int i = 0; i < dA.length ; i++){System.out.print(" \t" + dA[i] + " ");}
        System.out.print("\nstatus\t         ");
        for (int i = 0; i < status.length ; i++){System.out.print(" \t" + status[i] + "   ");}
        System.out.println();
    }
}