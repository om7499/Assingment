package Comditional_Statement_Ass;

import java.util.Scanner;

public class _11_Maximun_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first num : ");
		int num1 = s.nextInt();
		System.out.println("Enter second num : ");
		int num2 = s.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1+" is greter ");
		}
		else {
			System.out.println(num2+" is greter");
		}
	}

}
