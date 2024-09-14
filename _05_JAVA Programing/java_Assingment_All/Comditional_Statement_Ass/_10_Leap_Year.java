package Comditional_Statement_Ass;

import java.util.Scanner;

public class _10_Leap_Year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entr any year : ");
        int year = sc.nextInt();
        if(year % 4 == 0 && year % 100 != 0) {
        	System.out.println("Year is Leap...");
        }
        else {
        	System.out.println("Year is not Leap...");
        }
        
	}

}
