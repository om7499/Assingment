package Comditional_Statement_Ass;

import java.util.Scanner;

public class _14_Profit_loss {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter cost price : ");
		int cp = s.nextInt();
		System.out.println("Enter selling price : ");
        int sp = s.nextInt();
        int profit , loss ;
        if(cp>sp) {
        	loss = cp - sp ;
        	System.out.println("loss is : "+loss+"rs");
        }
        else {
        	profit = sp - cp;
        	System.out.println("Profit is : "+profit+"rs");
        }
	}

}
