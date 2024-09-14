package Looping_Statement_Ass;

import java.util.Scanner;

public class _05_Fibonacci_serise {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n= in.nextInt();
		int[] num = new int[n];
		num[0] = 0;
		num[1] = 1;
       for(int i=2;i<=n-1;i++) {
    	   num[i] = num[i-1] + num[i-2];
       }
       System.out.println("fibonocci serise : ");
       for(int j=0;j<=n-1;j++) {
    	   System.out.print(num[j]+" ");
       }
       
	}

}

/* output :
				    Enter any number : 7
					fibonocci serise : 
					0 1 1 2 3 5 8 
*/