package Array_Ass;

import java.util.Scanner;

public class _02_Array_Copy {

	public static void main(String[] args) {
		int[] arr = {1,2,3,6,8,4,9};
		int[] arr1 = new int[7];
		for(int i=0;i<arr.length;i++) {
			arr1[i] = arr[i];
		}
		System.out.print("orignal arr is : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		System.out.print("Copy  array is : ");
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}
// output: 
//   orignal arr is : 1 2 3 6 8 4 9 
//   Copy  array is : 1 2 3 6 8 4 9 
