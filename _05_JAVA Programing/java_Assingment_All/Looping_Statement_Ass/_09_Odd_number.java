package Looping_Statement_Ass;

import java.util.Scanner;

public class _09_Odd_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Start = sc.nextInt();
		int End = sc.nextInt();
		for(int i=Start ; i<=End ; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
