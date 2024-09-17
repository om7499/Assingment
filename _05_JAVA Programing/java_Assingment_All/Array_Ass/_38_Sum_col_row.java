package Array_Ass;
//write a java program the sum of each row and each column of a matrix

public class _38_Sum_col_row {

	public static void main(String[] args) {
		int[][] arr = {{10,21,13},{20,15,23},{17,28,39}};
		int row = arr.length;
		int col = arr[0].length;
	
		for(int i=0;i<row;i++) {
			int sumrow = 0;
			for(int j=0;j<col;j++) {
				sumrow = sumrow +arr[i][j];
			}
			System.out.println("Sum of row is : "+sumrow);
		}
		for(int i=0;i<col;i++) {
			int sumcol = 0;
			for(int j=0;j<row;j++) {
				sumcol = sumcol+arr[j][i];
			}
			System.out.println("sum of col is "+sumcol);
		}	
	}
}

/*output :
			Sum of row is : 44
			Sum of row is : 58
			Sum of row is : 84
			sum of col is 47
			sum of col is 64
			sum of col is 75
*/			
			
			
