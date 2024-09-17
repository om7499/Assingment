package Array_Ass;

import java.util.Arrays;
import java.util.Scanner;

public class _16_Unique_Element {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter array length : ");
        int leng = in.nextInt();
        int[] arr = new int [leng];
        for(int i=0;i<leng;i++) {
        	System.out.printf("arr[%d] = ",i);
        	arr[i] = in.nextInt();
        }
        _16_Unique_Element.unique(arr, leng);
	}
	static void unique(int[] arr ,int leng) {
		for (int i = 0; i < leng; i++)
		{
			int j;
			for (j = 0; j < i; j++)
			if (arr[i] == arr[j])
				break;
			if (i == j)
			System.out.print( arr[i] + " ");
		}

	}
}
/*output : 
			enter array length : 5
			arr[0] = 6
			arr[1] = 3
			arr[2] = 6
			arr[3] = 3
			arr[4] = 4
			6 3 4 
*/			
