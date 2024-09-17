package Array_Ass;
//write a java program print the sum of all the items of the array

public class _32_Print_sum {

	public static void main(String[] args) {
		int[]arr = {2,4,16,7,9,14,20};
		int sum = 0;
		System.out.print("Original array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
        System.out.print("Sum of array : "+sum );
	}

}
/*output : 
			Original array : 2 4 16 7 9 14 20 
			Sum of array : 72
*/