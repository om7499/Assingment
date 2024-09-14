package Looping_Statement_Ass;

import java.util.Scanner;

public class _19_Sum_of_Odd_number {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print( "Enter any number : ");
		int num = in.nextInt();
		int sum = 0;
		for(int i = 1;i<=num;i++) {
			if(i % 2 != 0) {
				sum = sum +i;
			}
		}
		System.out.println("Sum fo all Odd number : "+sum);

	}

}

/*output :
					Enter any number : 15
					Sum fo all Odd number : 64
*/