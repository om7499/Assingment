package Looping_Statement_Ass;

import java.util.Scanner;

public class _18_Sum_of_all_number {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter any number : ");
    int num = s.nextInt();
    int sum = 0;
    for(int i =1;i<=num;i++) {
    	sum = sum + i;
    }
    System.out.println("Sum of all num is : "+sum);

	}

}

/*output :
				Enter any number : 10
				Sum of all num is : 55
*/