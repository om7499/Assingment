package Pattern_Statement_Ass;

public class _04_Pattern {

	public static void main(String[] args) {
		int row = 5;
		for(int s=1;s<=row;s++) {
			for(int t=1;t<=s;t++) {
				System.out.print(s+" ");
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
