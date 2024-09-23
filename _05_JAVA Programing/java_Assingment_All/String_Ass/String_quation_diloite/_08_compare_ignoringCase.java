package String_quation_diloite;
//Write a program to compare two strings lexicographically , ignoring case differences

public class _08_compare_ignoringCase {

	public static void main(String[] args) {
		String name = "ombehare";
		String name1 = "jaybehare";
		
		int n = name.compareToIgnoreCase(name1);
		System.out.println("output : "+n);

	}

}

/*
output : 5
*/