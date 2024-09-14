package Comditional_Statement_Ass;

import java.util.Scanner;

public class _06_Divisible_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if(num % 5 == 0 && num % 11 == 0) {
			System.out.println("number is divisible by 5 and 11 ");
		}
		else {
			System.out.println("number is not divisible by 5 and 11");
		}

	}

}
