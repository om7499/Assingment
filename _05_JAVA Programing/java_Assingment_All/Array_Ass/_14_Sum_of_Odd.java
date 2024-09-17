package Array_Ass;

import java.util.Scanner;

// sum of all odd
public class _14_Sum_of_Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter length of array : ");
		int leng = sc.nextInt();
		
		int[] arr = new int[leng];
		int sum = 0;
		for(int i=0;i<leng;i++) {
			System.out.printf("arr[%d] = ",i);
			arr[i] = sc.nextInt();
		}
		for(int x :arr) {
			if(x % 2 != 0) {
				sum = sum+x;
			}
		}
		System.out.print("Sum of all Odd : "+sum);
	}
}
/*output :
			enter length of array : 5
			arr[0] = 5
			arr[1] = 2
			arr[2] = 6
			arr[3] = 3
			arr[4] = 7
			Sum of all Odd : 15
*/