package Array_Ass;

public class _31_PrintOdd_num {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,8,9,10};
		System.out.print("Original array : ");
		for(int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.print("Odd array Element : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 != 0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}

/*output :
			Original array : 2 3 4 5 6 8 9 10 
			Odd array Element : 3 5 9 
*/