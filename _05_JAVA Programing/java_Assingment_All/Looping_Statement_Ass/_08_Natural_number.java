package Looping_Statement_Ass;

import java.util.Scanner;

public class _08_Natural_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        int start = s.nextInt();
        System.out.print("Enter ending number : ");
        int end = s.nextInt();
        
        for(int i=start; i<=end;i++) {
        	System.out.println(i);
        }
	}

}
/*
Enter starting number : 1
Enter ending number : 10
			1
			2
			3
			4
			5
			6
			7
			8
			9
			10									
*/
