package Looping_Statement_Ass;

import java.util.Scanner;

public class _03_Reverse_Digits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = s.nextInt();
		
		int rev = 0;
		int rem;
		while(num>0) {
			rem = num % 10;
			rev = rev *10+ rem;
			num/= 10;
		}
		System.out.println("Reverse number : "+rev);

	}

	}

/* output :
				    Enter any number : 7894
				    Reverse number : 4987
   */
