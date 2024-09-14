package Pattern_Statement_Ass;

public class _11_Pattern {

	public static void main(String[] args) {
		int row = 5;
		for(int x=1;x<=row;x++) {
			for(int y=row;y>=x;y--) {
				System.out.print(" ");
			}
			for(int z=1;z<=x;z++) {
				System.out.print(x +" ");
			}
			System.out.println();
		}

	}

}
/*output :
			     1 
			    2 2 
			   3 3 3 
			  4 4 4 4 
			 5 5 5 5 5 
*/
