package Looping_Statement_Ass;

import java.util.Scanner;

public class _11_Prime_Number {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n = S.nextInt();
		int count = 0;
		for(int i=2;i<n;i++) {
			if(n % i == 0) {
				count ++;
				break;
			}	
		}
		if(count == 0) {
			System.out.println("It is prime number ");
		}
		else {
			System.out.println("it is not prime number ");
		}
	}

}

/*output :
				Enter any number : 5
				It is prime number 
*/