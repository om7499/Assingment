package _01_Variable_task_all;

import java.util.Scanner;

public class _02_Exercise {

	public static void main(String[] args) {
		//2: Calculate the sum of two integers.
		Scanner in = new Scanner(System.in);
		System.out.println("enter first number ");
		int num1 = in.nextInt();
		System.out.println("enter second number");
		int num2 = in.nextInt();
		int sum = num1 +num2;
		System.out.println("Total is : "+sum);

	}

}
