package Array_Ass;
//Write a program to calculate the average value of array elements

import java.util.Scanner;

public class _21_Avrage_of_array_ele {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter length of array : ");
		int leng = in.nextInt();
		int[] arr = new int[leng];
		int sum = 0 ,avrage = 0;
		for(int i=0;i<leng;i++) {
			System.out.printf("arr[%d] = ",i);
			arr[i] = in.nextInt();
		}
		for(int x : arr) {
			sum = sum + x;
			avrage = sum/leng;
		}
		System.out.print("Avarage of array : "+avrage);
	}
}

/*output ::
				enter length of array : 6
				arr[0] = 12
				arr[1] = 18
				arr[2] = 29
				arr[3] = 40
				arr[4] = 65
				arr[5] = 70
				Avarage of array : 39
*/