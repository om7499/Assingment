package Looping_Statement_Ass;

import java.util.Scanner;

public class _10_Power_find {

	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   System.out.print("Enter base value : ");
	   int base = s.nextInt();
	   System.out.print("Enter power value : ");
	   int power = s.nextInt();
	   int output = 1;
	   for(int x=1;x<=power;x++) {
		   output = output * base ;
	   }
       System.out.println("Result : "+output);

	}

}
/*output : 
				Enter base value : 5
				Enter power value : 3
				Result : 125
*/