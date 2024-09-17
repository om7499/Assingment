package Array_Ass;

import java.util.Scanner;

public class _30_Even_element {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter arr length : ");
		int leng = in.nextInt();
	    int[] arr = new int[leng];
	    for(int i=0;i<leng;i++) {
	    	System.out.printf("arr[%d] = ",i);
	    	arr[i] = in.nextInt();
	    }
	    System.out.print("even array : ");
        for(int i=0;i<leng;i++) {
        	if(arr[i] % 2 == 0) {
        		System.out.print(arr[i]+" ");
        	}
        }
	}
}

/*output :
			enter arr length : 5
			arr[0] = 3
			arr[1] = 4
			arr[2] = 6
			arr[3] = 2
			arr[4] = 7
			even array : 4 6 2 
*/