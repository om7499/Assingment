package Pattern_Statement_Ass;

public class _12_Pattern {

	public static void main(String[] args) {
		int alpha = 65;
		int row = 5;
		for(int a=1;a<=row;a++) {
			for(int b=row;b>=a;b--) {
				System.out.print("  ");
			}
			for(int c=1;c<=a;c++) {
				System.out.print((char)(alpha+a-1)+" ");
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
