package Pattern_Statement_Ass;

public class _18_Pattern {

	public static void main(String[] args) {
		int alpha = 65;
		int row = 5;
		for(int i= 1;i<=row;i++) {
			for(int j=row;j>=i;j--) {
				System.out.print((char)(alpha + i-1)+ " ");
			}
			System.out.println();
		}

	}

}

/*output:
				A A A A A 
				B B B B 
				C C C 
				D D 
				E 
 */
