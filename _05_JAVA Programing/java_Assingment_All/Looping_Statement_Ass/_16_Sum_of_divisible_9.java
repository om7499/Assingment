package Looping_Statement_Ass;

public class _16_Sum_of_divisible_9 {

	public static void main(String[] args) {
		System.out.println("All divisible by nine number :");
		int sum=0;
		for(int i=100;i<=200;i++) {
			if(i % 9 == 0) {
				System.out.println(i);
				 sum = sum+i;
			}
		}
		System.out.println("Sum of divisible by nine : "+sum);

	}

}
/*
 * All divisible by nine number :
			108
			117
			126
			135
			144
			153
			162
			171
			180
			189
			198
Sum of divisible by nine : 1683
*/
