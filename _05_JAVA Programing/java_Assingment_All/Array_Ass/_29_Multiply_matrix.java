package Array_Ass;

public class _29_Multiply_matrix {

	public static void main(String[] args) {
		int[][] arr1 = {{1,1,1},{2,2,2},{3,3,3}};
		int[][] arr2 = {{1,1,1},{2,2,2},{3,3,3}};
		
		int[][]arr3 = new int[3][3];
		System.out.println("Multiply of matrix : ");
        for(int i=0;i<3;i++) {
        	for(int j=0;j<3;j++) {
        		arr1[i][j] = 0;
        		for(int k=0;k<3;k++) {
        			arr3[i][j] = arr3[i][j] + arr1[i][k]*arr2[i][k];
        		}
        		System.out.print(" "+ arr3[i][j]+" ");
        	}
        	System.out.println();
        }
	}
}
