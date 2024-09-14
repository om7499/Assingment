package Comditional_Statement_Ass;

import java.util.Scanner;

public class _02_Alpha_number {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				char ch = in.next().charAt(0);
				if(ch >= 'a' && ch<='z'  || ch >= 'A' && ch <='Z' ) {
					System.out.println("This is Alphabet");
				}
				else if(ch >= '0' && ch<='9') {
					System.out.println("this is number");
				}
				else {
					System.out.println(" This is Special character");
				}

	}

}
