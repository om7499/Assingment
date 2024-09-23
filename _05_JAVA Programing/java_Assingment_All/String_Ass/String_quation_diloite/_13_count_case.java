package String_quation_diloite;
////Write a program to Count Number of Uppercase and Lowercase letters

public class _13_count_case {

	public static void main(String[] args) {
		String s1 = "JavaPrograming";
		int uppercount = 0;
		int lowercount = 0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z') {
				uppercount++;
			}
			else {
				lowercount++;
			}
		}
       System.out.println("Uppercase count is : "+uppercount);
       System.out.println("Lowercase count is : "+lowercount);
	}

}

/*output :
	Uppercase count is : 2
	Lowercase count is : 12
*/