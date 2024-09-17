package Array_Ass;

import java.util.Scanner;

public class _04_Even_Array {
     public static void main(String [] args) {
    	 System.out.print("Enter the Array limit :");
    	 Scanner in = new Scanner(System.in);
    	 int len = in.nextInt();
    	 int [] arr = new int[len];
    	 for(int i=0;i<len;i++) {
    		 System.out.printf("Element of a[%d] : ", i);
    		 arr[i] = in.nextInt();
    	 }
    	 System.out.print("Even array is : ");
    	 for(int x : arr) {
    		 if(x % 2==0) {
    			 System.out.print(x + " ");
    		 }
    	 } 
     }
}

/* output : 
                Enter the Array limit :4
				Element of a[0] : 1
				Element of a[1] : 2
				Element of a[2] : 4
				Element of a[3] : 6
				Even array is : 2 4 6 
*/