package String_quation_diloite;
//Write a program to compare a given string to the specified character sequence

public class _09_compare_specific_chracter {

	public static void main(String[] args) {
		String s1 = "java devloper";
		String s2 = "python devloper";
		CharSequence ch = "c lang";
		
		System.out.println(s1.contentEquals(ch));
		System.out.println(s2.contentEquals(ch));

	}

}

/*output :
	false
	false
*/