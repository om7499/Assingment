package Array_Ass;

import java.util.Scanner;

public class _13_Sum_of_negative {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter length of array : ");
        int leng = in.nextInt();
        
        int[]arr = new int[leng];
        int sum= 0;
        for(int i=0;i<leng;i++) {
        	System.out.printf("arr[%d] = ",i);
        	arr[i] = in.nextInt();
        }
        for(int i=0;i<leng;i++) {
        	if(arr[i]<0) {
        		sum = sum + arr[i];
        	}
        }
        System.out.print("Sum of negative is : "+sum);
	}
}
/*output :
			enter length of array : 5
			arr[0] = -3
			arr[1] = 6
			arr[2] = -5
			arr[3] = 1
			arr[4] = -8
			Sum of negative is : -16
*/
