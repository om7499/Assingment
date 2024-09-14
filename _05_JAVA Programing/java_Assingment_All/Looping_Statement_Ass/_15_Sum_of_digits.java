package Looping_Statement_Ass;

import java.util.Scanner;

public class _15_Sum_of_digits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter any digit number : ");
		int num = s.nextInt();
		int p = num;
		int sum = 0;
		int rem = 0;
		while(num >0) {
			rem = num % 10;
			sum = sum+ rem;
			num = num/10;
		}
		System.out.println("orignal digit : "+p);
		System.out.println("Sum of digits : "+sum);
	}

}
/*output :
				enter any digit number : 6543
				orignal digit : 6543
				Sum of digits : 18
*/
