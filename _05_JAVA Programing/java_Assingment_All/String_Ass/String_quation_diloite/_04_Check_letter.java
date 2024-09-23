package String_quation_diloite;
//Write a program to check if the letter is present in the word

public class _04_Check_letter {

	public static void main(String[] args) {
		String str = "ombehare";
		char ch = 'a';
		boolean temp = false ;
		for(int i=0;i<str.length();i++) {
			if(ch == str.charAt(i)) {
				temp = true;
			}
		}
		System.out.println(temp);
	}
}

/* output :
   true
*/