package String_quation_diloite;
//Write a program to compare a given string to the specified string buffer

public class _28_compare_string_buffer {

	public static void main(String[] args) {
		String name = "ombehare";
		String str1 = "jaybehare";
		StringBuffer strB = new StringBuffer(str1);
		
		System.out.println("compare "+name+ " and "+strB+" : "+name.equals(strB));
		System.out.println("compare "+str1+ " and "+strB+" : "+str1.equals(strB));

	}

}


/* output :
compare ombehare and jaybehare : false
compare jaybehare and jaybehare : false
*/