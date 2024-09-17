package Array_Ass;

import java.util.Scanner;

public class _37_Print_the_Sum {

	public static void main(String[] args) {
		int arr[] = new int[10];
		int sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter index of array  ");
		for(int a=0;a<10;a++) {
			System.out.printf("a[%d] = ",a);
			arr[a] = in.nextInt();
		}
		for(int x : arr ) {
			sum= sum + x ;
		}
        System.out.println("The Sum of array : "+sum);
	}
}

/*output :
		a[0] = 5
		a[1] = 3
		a[2] = 7
		a[3] = 9
		a[4] = 1
		a[5] = 6
		a[6] = 4
		a[7] = 8
		a[8] = 2
		a[9] = 7
		The Sum of array : 52
*/