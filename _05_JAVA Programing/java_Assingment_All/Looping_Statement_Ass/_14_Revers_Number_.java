package Looping_Statement_Ass;

import java.util.Scanner;

public class _14_Revers_Number_ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Starting num : ");
		int start = s.nextInt();
		System.out.print("Enter ending num : ");
		int end = s.nextInt();
		System.out.println("Reverse : ");
		for(int i = end;i>=start;i--) {
			System.out.println(i);
		}

	}

}

/*output :
					Enter Starting num : 1
					Enter ending num : 10
					Reverse : 
					10
					9
					8
					7
					6
					5
					4
					3
					2
					1
*/