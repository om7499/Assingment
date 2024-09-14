package Comditional_Statement_Ass;

import java.util.Scanner;

public class _23_Weak_DAy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter any weak day (1 to 7) : ");
		int day = s.nextInt();
		if(day == 1) {
			System.out.println("Monday");
		}
		else if(day == 2) {
			System.out.println("Tuesday");
		}
		else if(day == 3) {
			System.out.println("wednesday");
		}
		else if(day == 4) {
			System.out.println("Thursday");
		}
		else if(day == 5) {
			System.out.println("Friday");
		}
		else if(day == 6) {
			System.out.println("Saturday");
		}
		else if(day == 7) {
			System.out.println("Sunday");
		}
		else {
			System.out.println("Enter valid day");
		}

	}

}
