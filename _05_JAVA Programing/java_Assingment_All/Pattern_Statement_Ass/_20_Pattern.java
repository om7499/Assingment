package Pattern_Statement_Ass;

public class _20_Pattern {

	public static void main(String[] args) {
		int alpha = 65;
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(alpha + i-1)+" ");
			}
			System.out.println();
		}

	}

}
