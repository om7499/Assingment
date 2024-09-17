package Array_Ass;

import java.util.Scanner;

//Write a program to search an element in an array

public class _08_Array_Serch_Element {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter element limit : ");
		System.out.println();
		int len = in.nextInt();
		int[] arr = new int[len];
		int target = 10,flag=0;
		for(int i = 0;i<len;i++) {
			System.out.printf("Enter element of arr[%d] :", i);
			arr[i] = in.nextInt();
		}
		for(int i=0;i<len;i++) {
			if(arr[i] == target) {
				System.out.print("Element is found on : "+i);
				flag = flag +1;
			}
		}
		if(flag ==0) {
			System.out.println("element is not found");
		}
	}
}

