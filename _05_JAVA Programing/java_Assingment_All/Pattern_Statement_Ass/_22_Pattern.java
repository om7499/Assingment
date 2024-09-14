package Pattern_Statement_Ass;

public class _22_Pattern {

	public static void main(String[] args) {
		int alpha = 65;
		int row = 5;
		for (int a = 1; a <= row; a++) 
		{ 
			for (int b = row; b > a; b--)
			{
				System.out.print("  ");
			}
		int t = 1;
		for(int i = 1;i<=a;i++) {
			System.out.print((char)(alpha - 1 + t)+"  ");
			t = t * (a - i)/(i);
		}
		System.out.println();

		}
	}

}
/*output :
        A  
      A  A  
    A  B  A  
  A  C  C  A  
A  D  F  D  A 
 
*/
