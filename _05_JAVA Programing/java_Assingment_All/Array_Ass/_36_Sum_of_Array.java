package Array_Ass;

public class _36_Sum_of_Array {

	public static void main(String[] args) {
		int[] arr = {3,5,1,7,9,2,10};
		int sum = 0;
		for(int i : arr) {
		    sum = sum + i;
		}
        System.out.println("Sum of array : "+sum);
	}

}
/* output : 
       Sum of array : 37
 */              