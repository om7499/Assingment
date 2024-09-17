package Array_Ass;

import java.util.Scanner;

public class _24_Desecending_Array {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter array length : ");
        int leng = in.nextInt();
        
        int[] arr = new int[leng];
        int temp;
        
        for(int i=0;i<arr.length;i++) {
        	System.out.printf("arr[%d] = ",i);
        	arr[i] = in.nextInt();
        }
        
       for(int i=0;i<arr.length;i++) {
    	 for(int j=i+1;j<arr.length;j++) {
    		 if(arr[i] < arr[j]) {
       		  temp = arr[i];
       		  arr[i] = arr[j];
       		  arr[j] = temp;
       	  }
    	 }
       }
     
       System.out.print("Decsending array :");
       for(int x : arr) {
    	   System.out.print(x+" ");
       }
	}
}

/*output :
			enter array length : 5
			arr[0] = 6
			arr[1] = 36
			arr[2] = 41
			arr[3] = 72
			arr[4] = 61
			Decsending array :72 61 41 36 6 
*/