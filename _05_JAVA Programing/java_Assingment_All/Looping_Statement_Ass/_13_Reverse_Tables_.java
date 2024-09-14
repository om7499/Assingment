package Looping_Statement_Ass;

import java.util.Scanner;

public class _13_Reverse_Tables_ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number for table : ");
		int num = s.nextInt();
		for(int i =10;i>=1;i--) {
			int table = num * i;
			System.out.println(table);
		}

	}

}
/*output:
 Enter any number for table : 5
			50
			45
			40
			35
			30
			25
			20
			15
			10
			5
*/
