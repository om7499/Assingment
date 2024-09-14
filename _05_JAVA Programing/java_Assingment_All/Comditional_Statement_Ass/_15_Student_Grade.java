package Comditional_Statement_Ass;

import java.util.Scanner;

public class _15_Student_Grade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter all Subject marks :");
		int Math = in.nextInt();
		int Science = in.nextInt();
		int Marathi = in.nextInt();
		int Hindi = in.nextInt();
		int English = in.nextInt();
		 int total = Math +Science + Marathi + Hindi + English;
		 int percent = total / 5;
		 if(percent >=90) {
			 System.out.println(" A grade ");
		 }
		 else if(percent >=70) {
			 System.out.println(" B grade ");
		 }
		 else if(percent >= 50) {
			 System.out.println("  C grade ");
		 }
		 else if(percent >= 35) {
			 System.out.println("  only pass ");
		 }
		 else {
			 System.out.println("Failed");
		 }

	}

}
