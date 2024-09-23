package String_quation_diloite;
//Write a program to check whether two String objects contain the same data

public class _05_Check_sameData {

	public static void main(String[] args) {
		String s1 = "ombehare";
		String s2 = "jaybehare";
		String s3 = "ombehare";
		
       System.out.println(s1.equals(s2));
       System.out.println(s1.equals(s3));
	}

}


/* output :
	false
	true
*/