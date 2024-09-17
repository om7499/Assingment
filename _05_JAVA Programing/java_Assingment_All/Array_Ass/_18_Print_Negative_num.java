package Array_Ass;
// take array from user and print it
import java.util.Scanner;

public class _18_Print_Negative_num {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter length of array : ");
		int L = in.nextInt();
		
		int[] arr = new int[L];
		for(int i=0;i<L;i++) {
			System.out.printf("arr[%d] = ",i);
			arr[i] = in.nextInt();
		}
		_18_Print_Negative_num.negative(arr, L);
	}
	static void negative(int []arr,int leng) {
		System.out.print("Negatine of array : ");
		for(int i=0;i<leng;i++) {
			if(arr[i] <0) {
				System.out.print(arr[i]+"  ");
			}
		}
	}
}

/*output :: 
			enter length of array : 5
			arr[0] = -3
			arr[1] = 5
			arr[2] = -2
			arr[3] = -7
			arr[4] = 8
			Negatine of array : -3  -2  -7  
*/