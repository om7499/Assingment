package _01_Variable_task_all;

import java.util.Scanner;

public class _07_ {

	public static void main(String[] args) {
		 //7: Perform arithmetic operations.
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = in.nextInt();
		System.out.println("enter second number : ");
		int num2 = in.nextInt();
		
		int Sum = num1 + num2;
		int Sub = num1 - num2;
		int div = num1 / num2;
		int mult = num1 * num2;
		
		System.out.println("Addition is : "+Sum);
		System.out.println("Substraction is : "+Sub);
		System.out.println("Multiply is : "+mult);
		System.out.println("Division is : "+div);

	}

}
