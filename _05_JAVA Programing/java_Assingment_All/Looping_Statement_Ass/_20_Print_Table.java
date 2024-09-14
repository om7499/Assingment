package Looping_Statement_Ass;

import java.util.Scanner;

public class _20_Print_Table {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Start value : ");
		int start = s.nextInt();
		System.out.print("End value : ");
		int end = s.nextInt();
		System.out.print("Table value : ");
		int table = s.nextInt();
		for(int i = start;i<=end;i++) {
			System.out.println(table+ "  *  " + i + " = " + (i * table) );
		}

	}

}
/*output :
Start value : 1
End value : 10
Table value : 5					
						5  *  1 = 5
						5  *  2 = 10
						5  *  3 = 15
						5  *  4 = 20
						5  *  5 = 25
						5  *  6 = 30
						5  *  7 = 35
						5  *  8 = 40
						5  *  9 = 45
						5  *  10 = 50
*/
