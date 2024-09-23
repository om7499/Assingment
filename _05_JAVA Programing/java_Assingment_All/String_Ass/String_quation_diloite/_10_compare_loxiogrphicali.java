package String_quation_diloite;
//Write a program to compare two strings lexicographically Two Strings

public class _10_compare_loxiogrphicali {

	public static void main(String[] args) {
		String str1 = "programer";
		String str2 = "java programer";
		int check = str1.compareTo(str2);
		if(check <0) {
			System.out.println("string-1 is less than string-2");
		}
		else if(check == 0){
			System.out.println("string-1 is equle to string-2");
		}
		else {
			System.out.println("string-1  is greter than string-2");
		}
	}
}

/* output :
string-1  is greter than string-2
*/