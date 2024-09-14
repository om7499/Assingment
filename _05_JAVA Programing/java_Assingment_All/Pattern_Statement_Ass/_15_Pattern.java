package Pattern_Statement_Ass;

public class _15_Pattern {

	public static void main(String[] args) {
		int row = 5;
		for(int i=row;i>=1;i--) {
			for(int j=row;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
/*output:
				5 
				5 4 
				5 4 3 
				5 4 3 2 
				5 4 3 2 1 

 */