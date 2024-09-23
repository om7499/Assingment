package String_quation_diloite;
//Write a program to test if a given string contains the specified sequence of char values

public class _29_String_contains {

	public static void main(String[] args) {
		String str1 = "om java programing";
		String str2 = "java";
		String str3 = "programer";
		
		System.out.println(str1.contains(str2));
		System.out.println(str1.contains(str3));

	}

}

/* output : 
true
false
*/