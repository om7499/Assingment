package Pattern_Statement_Ass;

public class _09_Pattern {

	public static void main(String[] args) {
		int alpha = 65;
		int row = 5;
		for(int a=row;a>=1;a--) {
			for(int b=1;b<=a;b++) {
				System.out.print(" "+" ");
			}
			for(int c=a;c<=row;c++) {
				System.out.print((char)(alpha + c-1));
			}
			System.out.println();
		}

	}

}
/*output: 
		          E
		        DE
		      CDE
		    BCDE
		  ABCDE
*/
