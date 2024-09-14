package Comditional_Statement_Ass;
/*Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:

For first 50 units Rs. 0.50/unit
For next 150 units Rs. 0.75/unit
For next 250 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill
* */

import java.util.Scanner;

public class _20_Unit_Charges {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter electicity bill unit");
		int unit = s.nextInt();
		float amt , srcharge, bill_amt;
		if(unit <= 50) {
			amt = unit * 0.5f;
		}
		else if(unit <=150) {
			amt = unit * 0.75f;
		}
		else if(unit <=250) {
			amt = unit * 1.20f;
		}
		else  {
			amt = unit * 1.50f;
		}
		srcharge = amt * 0.2f;
		bill_amt = amt + srcharge;
		System.out.println("Total Electricity bill is : "+bill_amt);
	}

}
