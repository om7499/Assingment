package String_quation_diloite;
//Write a program to get the character at the given index within the String

public class _02_char_idx {

	public static void main(String[] args) {
		String str = "check String";
		int x= str.indexOf('e');
		int y= str.indexOf('n');
		
		System.out.println("The index position of  e is : "+x);
		System.out.println("The index position of  n is : "+y);

	}

}

/* output : 
	The index position of  e is : 2
	The index position of  n is : 10
*/