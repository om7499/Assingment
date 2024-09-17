package Array_Ass;
//Write a program to merge two arrays elements to store third 
public class _39_Third_array_store {

	public static void main(String[] args) {
		int[] arr = {2,5,7,4,1,9};
		int[]arr1 = {9,7,3,5,2,1};
		int len = arr.length + arr1.length;
		int[] arr2 = new int[len];
		int x =0;
		for(int i=0;i<arr.length;i++) {
			arr2[x] = arr[i];
			x++;
		}
		for(int i=0;i<arr1.length;i++) {
			arr2[x] = arr1[i];
			x++;
		}
		System.out.print("merge two array : ");
		for(int i:arr2) {
			System.out.print(i+" ");
		}	
	}
}
//output :
//          merge two array : 2 5 7 4 1 9 9 7 3 5 2 1 