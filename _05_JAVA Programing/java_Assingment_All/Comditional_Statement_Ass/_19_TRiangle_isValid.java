package Comditional_Statement_Ass;

import java.util.Scanner;

public class _19_TRiangle_isValid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a1 = s.nextInt();
		int a2 = s.nextInt();
		int a3 = s.nextInt();
		int sum = a1+ a2+ a3;
		if(sum == 180 && a1 >0 && a2 >0 && a3>0) {
			System.out.println("triangle is valid");
		}
		else {
			System.out.println("Triangle is not valid");
		}
	} 
}
