package Pattern_Statement_Ass;

public class _10_Pattern {

	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=row;j>i;j--) {
				System.out.print(" "+" ");
			}
			for(int k=1;k<=(i*2)-1;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
/*output: 
		        1 
		      1 2 3 
		    1 2 3 4 5 
		  1 2 3 4 5 6 7 
		1 2 3 4 5 6 7 8 9 
*/
