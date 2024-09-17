package Array_Ass;

import java.util.Scanner;

public class _03_Cubic_Array {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("enter limt of array  : ");
    int S = sc.nextInt();
    int[] arr = new int[S];
    for(int i=0;i<S;i++) {
    	System.out.printf("element of arr[%d] : ", i);
    	arr[i] = sc.nextInt();
    }
    System.out.println("Cubic Array Elements...");
    for(int e:arr) {
    	System.out.print(e*e*e +" ");
    }
	}
}
/*output :
				enter limt of array  : 4
				element of arr[0] : 2
				element of arr[1] : 4
				element of arr[2] : 6
				element of arr[3] : 8
				Cubic Array Elements...
				8 64 216 512 
 */


