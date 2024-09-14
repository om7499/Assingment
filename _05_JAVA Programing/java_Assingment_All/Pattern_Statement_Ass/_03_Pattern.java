package Pattern_Statement_Ass;

public class _03_Pattern {

	public static void main(String[] args) {
		int row = 5;
		for(int z=1;z<=row;z++) {
			for(int y=1;y<=z;y++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}

/* output:
					* 
					* * 
					* * * 
					* * * * 
					* * * * * 
*/
