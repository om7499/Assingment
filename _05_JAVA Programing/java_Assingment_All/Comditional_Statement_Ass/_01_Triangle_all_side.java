package Comditional_Statement_Ass;

import java.util.Scanner;

public class _01_Triangle_all_side {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("entr side 1 : ");
		int side1 = in.nextInt();
		System.out.println("entr side 2 : ");
		int side2 = in.nextInt();
		System.out.println("entr side 3 : ");
		int side3 = in.nextInt();
		if((side1 + side2) > side3) {
			if((side2 + side3) > side1) {
				if((side1 + side3) > side2) {
					System.out.println("Triangle  is  valid");
				}
				else {
					System.out.println("Triangle is not valid");
				}
			}
			else {
				System.out.println("Triangle is not valis");
			}
		}
		else {
			System.out.println("Triangle is not valid");
		}
	}

}
