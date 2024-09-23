package String_quation_diloite;
//Write a program How to search a word inside a string?

public class _25_Serch_words {

	public static void main(String[] args) {
		String str = "littel flower english school";
		int n = str.indexOf("english");
		if(n == -1) {
			System.out.println("english is not found"); 
		}
		else {
			System.out.println("engilsh index position is : "+n);
		}

	}

}

/* output :
	engilsh index position is : 14
*/