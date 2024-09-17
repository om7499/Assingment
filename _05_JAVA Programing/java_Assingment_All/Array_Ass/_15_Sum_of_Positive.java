package Array_Ass;

import java.util.Scanner;

// sum of all positive number
public class _15_Sum_of_Positive {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter length of array ; ");
        int leng = in.nextInt();
        int sum = 0;
        int[]arr= new int[leng];
        for(int i=0;i<leng;i++) {
        	System.out.printf("arr[%d] = ",i);
        	arr[i] = in.nextInt();
        }
        for(int x :arr) {
        	if(x>0) {
        		sum = sum + x;
        	}
        }
        System.err.println("The sum of Positive : "+sum);
	}
}
/*output :
			enter length of array ; 5
			arr[0] = -2
			arr[1] = 6
			arr[2] = 4
			arr[3] = -7
			arr[4] = 1
			The sum of Positive : 11
*/
