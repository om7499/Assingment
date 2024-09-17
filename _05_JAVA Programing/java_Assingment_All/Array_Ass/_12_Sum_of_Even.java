package Array_Ass;

import java.util.Scanner;

// sum of even numbers
public class _12_Sum_of_Even {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter length of array : ");
		int leng = in.nextInt();
		int[]arr = new int[leng];
		int sum = 0;
		for(int i=0;i<leng;i++) {
			System.out.printf("arr[%d] = ",i);
			arr[i] = in.nextInt();
		}
		for(int a : arr) {
			if(a % 2 == 0) {
				sum = sum +a; 
			}
		}
        System.out.print("The sum of even Array is : "+sum);
	}
}
/*output :
			enter length of array : 5
			arr[0] = 6
			arr[1] = 3
			arr[2] = 2
			arr[3] = 8
			arr[4] = 4
			The sum of even Array is : 20
*/			
			
