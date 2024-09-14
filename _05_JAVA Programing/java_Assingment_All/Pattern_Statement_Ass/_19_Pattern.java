package Pattern_Statement_Ass;

public class _19_Pattern {

	public static void main(String[] args) {
		int alpha = 65;
		int row = 5;
		for(int x=row;x>=1;x--) {
			for(int y=row;y>=x;y--) {
				System.out.print((char)(alpha + x-1)+" ");
			}
			System.out.println();
		}

	}

}

/*output :
				E 
				D D 
				C C C 
				B B B B 
				A A A A A 
*/
