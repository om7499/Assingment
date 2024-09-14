package Pattern_Statement_Ass;

public class _21_Pattern {

 	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=row;j>i;j--) {
				System.out.print(" ");
			}
			int temp = 1;
			for(int k=1;k<=i;k++) {
				System.out.print(temp + " ");
				temp = temp * (i - k)/(k); 
			}
			System.out.println();
		}
	}
}

/*output :
			    1 
			   1 1 
			  1 2 1 
			 1 3 3 1 
			1 4 6 4 1 
*/
