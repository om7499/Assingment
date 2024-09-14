package Comditional_Statement_Ass;

import java.util.Scanner;

public class _21_Upper_Lower_case {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter any character : ");
		char ch = in.next().charAt(0);
		if(ch >= 'a' && ch <= 'z') {
			System.out.print("Lowercase");
		}
		else if(ch >= 'A' && ch<='Z') {
			System.out.println("Uppercase");
		}
		else {
			System.out.println("It is not Character");
		}

	}

}
