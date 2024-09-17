package Array_Ass;
//Write a program to array elements to print sum of Cubic
public class _11_Array_sum_Cubic {

	public static void main(String[] args) {
		int[] arr = {2,7,9,6,4,1};
		int sum = 0;
		for(int a : arr) {
			sum = sum + (a*a*a);
		}
		System.out.println("The cubic sum is : "+sum);

	}

}
// output : 
//             The cubic sum is : 1361