package Array_Ass;
// print reverse order
public class _33_ReverseOrder {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.out.print("Original array : ");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Reverse array : ");
		
        for(int x=arr.length-1;x>=0;x--) {
        	System.out.print(arr[x]+" ");
        }
	}
}

/*output :
 *          Original array : 1 2 3 4 5 6 
			erse array : 6 5 4 3 2 1 
*/			
			
