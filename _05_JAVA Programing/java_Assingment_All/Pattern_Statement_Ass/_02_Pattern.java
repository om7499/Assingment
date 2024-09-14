package Pattern_Statement_Ass;

public class _02_Pattern {

	public static void main(String[] args) {
		int alpha = 65;
		int row = 5;
		for(int k = 1;k<=row;k++) {
			for(int l = 1; l<=k;l++) {
				System.out.print((char)(alpha + l-1) +" " );
			}
			System.out.println();
		}
	

     }
}

/*output :
					A 
					A B 
					A B C 
					A B C D 
					A B C D E
 */
 