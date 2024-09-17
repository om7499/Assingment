package Array_Ass;

import java.util.Scanner;

public class _05_Min_Max_Array {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =in.nextInt();
		int [] arr =new int[l];
		int max=0,min=0;
		for(int i=0;i<l;i++)
		{
			System.out.printf("Enter Element of a[%d] :",i);
			arr[i]=in.nextInt();
		}		
		max=arr[0];
		min=arr[0];
		for(int i=0;i<l;i++)
		{
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("Maximum Element of Array : "+max);
		System.out.println("Minimum Element of Array : "+min);

	}

}
/*output:
			Enter the Array Limit :6
			Enter Element of a[0] :5
			Enter Element of a[1] :3
			Enter Element of a[2] :8
			Enter Element of a[3] :7
			Enter Element of a[4] :2
			Enter Element of a[5] :1
			Maximum Element of Array : 8
			Minimum Element of Array : 1
*/
