package Pattern_Statement_Ass;

public class _07_Pattern {

	public static void main(String[] args) {
		int row =5;
		for(int a=row;a>=1;a--) {
			for(int b=1;b<=a;b++) {
				System.out.print("  ");
			}
			for(int c=a;c<=row;c++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}
/*output :
			          5 
			        4 5 
			      3 4 5 
			    2 3 4 5 
			  1 2 3 4 5 
*/