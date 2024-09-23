package String_quation_diloite;
//Write a program to check whether a given string ends with the contents of another string

public class _03_check_EndsWith {

	public static void main(String[] args) {
		String str = "ombehare";
		boolean b = str.endsWith("h");
		boolean T = str.endsWith("e");
        System.out.println(b);
        System.out.println(T);
	}

}

/*output :
	false
	true
*/