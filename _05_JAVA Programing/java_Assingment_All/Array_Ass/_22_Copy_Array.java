package Array_Ass;
//Write a program copy all elements of one array into another array

public class _22_Copy_Array {

	public static void main(String[] args) {
		int[] arr1 = {12,52,78,64,39,68,28};
        int[] arr2 = new int[arr1.length];
        System.out.print("original array : ");
        
        for(int i=0;i<arr1.length;i++) {
        	System.out.print(arr1[i]+" ");
        }
        for(int i=0;i<arr1.length;i++) {
        	arr2[i] = arr1[i];
        }
        System.out.println();
        System.out.print("Copy array :");
        for(int x=0;x<arr2.length;x++) {
        	System.out.print(arr2[x]+" ");
        }
	}
}

/*output:
			original array : 12 52 78 64 39 68 28 
			Copy array :12 52 78 64 39 68 28 
*/