package Array_Ass;

import java.util.Scanner;

public class _07_Reverse_Array {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter array limit :");
        int L = in.nextInt();
        int[]arr = new int[L];
        for(int i=0;i<L;i++) {
        	System.out.printf("Enter array element arr[%d] : "+i);
        	arr[i] = in.nextInt();
        }
        System.out.print("reverse array is : ");
        for(int x=L-1;x>=0;x--) {
        	System.out.print(x);
        }
	}

}
