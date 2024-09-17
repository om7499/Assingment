package Array_Ass;

import java.util.Scanner;

public class _06_Odd_number_Array {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter array limit : ");
		int L = in.nextInt();
		int[] arr = new int[L];
		for(int x=0; x<L;x++) {
			System.out.printf("Emter array Element arr[%d] : ", x);
			arr[x] = in.nextInt();
		}
		System.out.print("Odd number is : ");
		for(int i=0;i<L;i++) {
			if(arr[i] % 2 != 0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}

/*output :
			enter array limit : 5
			Emter array Element arr[0] : 1
			Emter array Element arr[1] : 3
			Emter array Element arr[2] : 4
			Emter array Element arr[3] : 2
			Emter array Element arr[4] : 5
			Odd number is : 1 3 5
*/			 