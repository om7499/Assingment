package Pattern_Statement_Ass;

public class _14_Pattern {

	public static void main(String[] args) {
		int row = 5;
		for(int p=1;p<=row;p++) {
			for(int q=row;q>=p;q--) {
				System.out.print(q+" ");
			}
			System.out.println();
		}

	}

}
/*output:
				5 4 3 2 1 
				5 4 3 2 
				5 4 3 
				5 4 
				5 

 */