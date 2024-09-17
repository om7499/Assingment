package Array_Ass;

public class _01_Add_Arrays {

	public static void main(String[] args) {
		int[][]arr = {{10,25,28},{19,16,21},{18,25,29}};
		int[][]arr1 = {{12,34,15},{16,18,19},{4,29,15}};
		int arr2[][] = new int[3][3]; 
		System.out.print("sum of two arrays is : ");
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<3;j++) {
        		arr2[i][j] =  arr[i][j] + arr1[i][j];
        		System.out.print(arr2[i][j]+" ");
        	}
        }   
	}
}
//output :
//            sum of two arrays is : 22 59 43 35 34 40 22 54 44            