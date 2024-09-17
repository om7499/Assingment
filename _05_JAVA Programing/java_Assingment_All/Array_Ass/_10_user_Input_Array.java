package Array_Ass;

import java.util.Scanner;

public class _10_user_Input_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter array limit : ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			System.out.printf("Enter array element arr[%d] : ",i);
			arr[i] = sc.nextInt();
		}
		System.out.print("Array is : ");
		for(int x = 0;x<len;x++) {
			System.out.print(arr[x]+" ");
		}
	}
}

/*output :
             enter array limit : 5
			Enter array element arr[0] : 2
			Enter array element arr[1] : 3
			Enter array element arr[2] : 4
			Enter array element arr[3] : 5
			Enter array element arr[4] : 7
			Array is : 2 3 4 5 7
*/ 