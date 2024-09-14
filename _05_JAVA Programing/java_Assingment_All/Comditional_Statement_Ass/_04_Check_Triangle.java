package Comditional_Statement_Ass;

import java.util.Scanner;

public class _04_Check_Triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("entr side 1 : ");
		int side1 = s.nextInt();
		System.out.println("entr side 2 : ");
		int side2 = s.nextInt();
		System.out.println("entr side 3 : ");
		int side3 = s.nextInt();
		if(side1 == side2 && side2==side3) {
			System.out.println("equlitral Triangle");
		}
		else if(side1 == side2 || side2 == side3 || side1 == side3) {
			System.out.println("Isoscale triangel");
		}
		else {
			System.out.println("Scalen Triangel");
		}

	}

}
