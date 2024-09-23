package String_quation_diloite;
//Write a program to count a number of Unicode code points in the specified text range of a String

public class _07_codepoint_count {

	public static void main(String[] args) {
		String str = "bahubali";
		int c = str.codePointCount(1,6);
        System.out.println( "codpointCount is : "+c);
	}

}


/*output:
	codpointCount is : 5
*/