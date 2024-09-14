package Comditional_Statement_Ass;

import java.util.Scanner;

public class _03_Check_Alphabet {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			char ch = s.next().charAt(0);
			if(ch>='a' && ch<='A') {
				System.out.println("It is Alphabet");
			}
			else {
				System.out.println("It is not Alphabet");
			}
		}
	}

}
