package Looping_Statement_Ass;

import java.util.Scanner;

//Write a program to find sum of all natural numbers between 1 to n

public class _17_Sum_of_even_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = s.nextInt();
		int sum =0;
		for(int i=1;i<=n;i++) {
			if(i % 2 == 0) {
				sum = sum +i;
			}
		}
		System.out.println("Sum of even number is  : "+sum);

	}

}

/*output: 
		Enter any number : 20
		Sum of even number is  : 110
*/