package Pattern_Statement_Ass;

public class _17_Pattern {

	public static void main(String[] args) {
		int alpha = 65;
		int row = 5;
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(alpha + i-1)+" ");
			}
			System.out.println();
		}

	}

}

/*output:
				E E E E E 
				D D D D 
				C C C 
				B B 
				A 
*/
 