package Array_Ass;

import java.util.Scanner;

//Write a program to store elements in an array and print it
public class _35_Store_element {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter array length : ");
		int leng = in.nextInt();
		int[] arr = new int[leng];
		for(int i=0;i<leng;i++) {
			System.out.printf("arr[%d] = ",i);
			arr[i] = in.nextInt();
		}
		System.out.print("Array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

/*output :
			enter array length : 5
			arr[0] = 6
			arr[1] = 7
			arr[2] = 3
			arr[3] = 4
			arr[4] = 2
			Array : 6 7 3 4 2 
*/