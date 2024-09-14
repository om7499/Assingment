package Comditional_Statement_Ass;

import java.util.Scanner;

public class _07_Even_or_Odd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number  : "); 
        int num = s.nextInt();
        if(num % 2 == 0) {
        	System.out.println("Number is Even ");
        }
        else {
        	System.out.println("Number is Odd");
        }
	}

}
