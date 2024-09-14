package Comditional_Statement_Ass;

import java.util.Scanner;

/*
 * Write a program to input basic salary of an employee and 
 * calculate its Gross salary according to following:

Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%
 * */

public class _09_Gross_Salary {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int BS = S.nextInt();
		float HRA,DA ;
		if(BS <= 10000) {
			HRA = BS * 02f;
			DA = BS * 0.8f;
		}
		else if(BS <= 20000) {
			HRA = BS * 03f;
			DA = BS * 0.95f;
		}
		else {
			HRA = BS * 02f;
			DA = BS * 0.8f;
		}
		System.out.println(" Gross Salary : " + (BS + HRA + DA));
			

	}

}
