package Pattern_Statement_Ass;

public class _05_Pattern {

	public static void main(String[] args) {
		int row = 5;
		for(int a=1;a<=row;a++) {
			for(int b=row;b>a;b--) {
		         System.out.print(" "+" ");
			}
			for(int c=1;c<=a;c++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
}

/*output :
			* 
		      * * 
		    * * * 
		  * * * * 
		* * * * * 

 */
