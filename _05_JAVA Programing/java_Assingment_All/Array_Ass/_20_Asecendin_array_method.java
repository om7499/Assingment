package Array_Ass;

import java.util.Arrays;

// using sort method
public class _20_Asecendin_array_method {

	public static void main(String[] args) {
		int[]arr = {5,8,7,6,3,9,12,15,40};
		System.out.print("Original array : "+Arrays.toString(arr));
		System.out.println();
	    Arrays.sort(arr); 
		System.out.print( "Sorted array : "+Arrays.toString(arr));
	}
}
// output :
//             Original array : [5, 8, 7, 6, 3, 9, 12, 15, 40]
// 			Sorted array : [3, 5, 6, 7, 8, 9, 12, 15, 40]