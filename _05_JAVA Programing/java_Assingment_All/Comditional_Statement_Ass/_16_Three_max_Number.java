package Comditional_Statement_Ass;

import java.util.Scanner;

public class _16_Three_max_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num First : ");
		int num1 = sc.nextInt();
		System.out.println("enter num Second : ");
		int num2 = sc.nextInt();
		System.out.println("enter num Third : ");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1+" is greater ");
		}
		else if(num2 >num1 && num2 > num3) {
			System.out.println(num2+"is greater");
		}
		else {
			System.out.println(num3+"is greter");
		}

	}

}
