package Comditional_Statement_Ass;

import java.util.Scanner;

public class _18_Total_expences {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the quntity purchased : ");
		int qty =s. nextInt();
		System.out.println("entr amount per item");
		float amount = s.nextInt();
		float exp;
		if(qty == 100) {
			exp = qty * amount;
			exp = exp - (exp * 0.1f);
		}
		else {
			exp = qty *  amount;
		}
		
		System.out.println("Total expencess is : "+exp);
		
	}

}
