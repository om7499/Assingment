package _01_Variable_task_all;

import java.util.Scanner;

public class _06_Exercise {

	public static void main(String[] args) {
		// 6: Calculate the total cost.
		Scanner in = new Scanner(System.in);
		System.out.println("Enter price : ");
		int price = in.nextInt();
		System.out.println("enter Quntity : ");
		int Quntity = in.nextInt();
		int Total_cost = price * Quntity;
		System.out.println("Total_cost : "+Total_cost);

	}

}
