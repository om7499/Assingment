package Array_Ass;

import java.util.Arrays;
import java.util.Collections;

public class _25_Array_desecending2 {

	public static void main(String[] args) {
		Integer[] arr = {2,5,8,3,6,1,7,9};
		System.out.print("Original Array : ");
		for(int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		Arrays.sort(arr, Collections.reverseOrder());
	    System.out.println("Decsending Arrays : "+Arrays.toString(arr));

	}

}
//output : 
//			  Original Array : 2 5 8 3 6 1 7 9 
//			  Decsending Arrays : [9, 8, 7, 6, 5, 3, 2, 1]