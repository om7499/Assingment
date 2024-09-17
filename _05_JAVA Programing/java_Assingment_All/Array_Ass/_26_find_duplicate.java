package Array_Ass;

public class _26_find_duplicate {

	public static void main(String[] args) {
		int[]arr = {3,5,6,8,2,9,1,3,2,7,5};
		System.out.print("Duplicate element is : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]== arr[j]) {
					System.out.print(arr[j]+" ");
				}
			}
		}
	}
}

// output :
//         Duplicate element is : 3 5 2 