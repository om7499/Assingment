package Looping_Statement_Ass;

import java.util.Scanner;

public class _06_Factorial_ {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.print("enter any number : ");
     int num = s.nextInt();
     int fact = 1;
     for(int i=1; i<=num;i++) {
    	 fact = fact * i;
     }
     System.out.println("factorial of "+num+" is : "+fact);
	}

}

/* output :
				enter any number : 5
				factorial of 5 is : 120
*/