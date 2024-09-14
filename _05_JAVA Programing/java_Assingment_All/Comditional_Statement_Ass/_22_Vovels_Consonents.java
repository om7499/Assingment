package Comditional_Statement_Ass;

import java.util.Scanner;

public class _22_Vovels_Consonents {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any Character : ");
		char ch = s.next().charAt(0);
		if(ch == 'a' || ch=='e' || ch=='i' || ch == 'o' || ch=='u') {
			System.out.println("it  is Vovel");
		}
		else {
			System.out.println("it is consonents");
		}

	}

}
