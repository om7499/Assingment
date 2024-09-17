package Array_Ass;

import java.util.Scanner;

// print positiv array
public class _17_Print_positive_array {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter array length : ");
		int leng = in.nextInt();
		int[] arr = new int[leng];
		for(int i=0;i<leng;i++) {
			System.out.printf("arr[%d] = ",i);
			arr[i] = in.nextInt();
		}
		System.out.print("positive number array : ");
		for(int x : arr) {
			if(x > 0) {
				System.out.print(x+" ");
			}
		}
	}
}
/*output :
			enter array length : 5
			arr[0] = 3
			arr[1] = -2
			arr[2] = 5
			arr[3] = -6
			arr[4] = 7
			positive number array : 3 5 7 
*/