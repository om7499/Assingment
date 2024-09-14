package Pattern_Statement_Ass;

public class _08_Pattern {

	public static void main(String[] args) {
		int alpha = 65;
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=row;j>=i;j--) {
				System.out.print(" "+" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print((char)(alpha + i-1)+ " ");
			}
				System.out.println();
		}

	}
}
	/*output :
				      A 
			        B B 
			      C C C 
			    D D D D 
			  E E E E E 
*/

