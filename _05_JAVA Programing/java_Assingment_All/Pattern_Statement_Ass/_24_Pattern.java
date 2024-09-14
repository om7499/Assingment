package Pattern_Statement_Ass;

public class _24_Pattern {

	public static void main(String[] args) {
		int alpha = 65;
		int row = 5;
		for(int i = 1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char) (alpha + j-1)+ " ");
			}
			System.out.println();
		}
		for(int i=row;i>=1;i--) {
			for(int j= 1;j<i;j++) {
				System.out.print( (char) (alpha +j-1)+ " ");
			}
			System.out.println();
		}

	}

}

/*output:
				A 
				A B 
				A B C 
				A B C D 
				A B C D E 
				A B C D 
				A B C 
				A B 
				A 
*/
