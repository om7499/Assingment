package Array_Ass;
import java.util.*;
public class _23_Delete_Duplicate {

	public static void main(String[] args) {
		int[] arr = {1,2,2,4,5,5,6};
		int[] temp = new int[arr.length];
		int j=0;
		System.out.print("Before Remove Duplicate : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		//duplicate element remove only sorted array
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j] = arr[i];
				j++;
			}
		}
		System.out.println();
		System.out.print("After Remove Duplicate : ");
		temp[j] = arr[arr.length-1];
		for(int x=0;x<arr.length;x++) {
			System.out.print(temp[x]+" ");
		}
		System.out.println();
/*output :
		Before Remove Duplicate : 1 2 2 4 5 5 6 
		After Remove Duplicate : 1 2 4 5 6 0 0 
*/		
		HashSet<Integer> hs = new HashSet();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		System.out.print("using hashSet remov Dub : ");
		for(int x : hs) {
			System.out.print(x+" ");
		}
		
		
	}
}

