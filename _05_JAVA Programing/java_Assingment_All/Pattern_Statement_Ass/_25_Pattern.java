package Pattern_Statement_Ass;

public class _25_Pattern {

	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int x=1;x<=i;x++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		for(int i = 1;i<=row-1;i++) {
			for(int x=row-1;x>=i;x--) {
				System.out.print("*  ");
			}
			System.out.println();
		}

	}

}
/*output :
					*   
					*  *  
					*  *  *  
					*  *  *  *  
					*  *  *  *  *  
					*  *  *  *  
					*  *  *  
					*  *  
					*  
*/
