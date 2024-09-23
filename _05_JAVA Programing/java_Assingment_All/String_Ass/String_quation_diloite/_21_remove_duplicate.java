package String_quation_diloite;

public class _21_remove_duplicate {
 public static void remove_duplicate(String s1) {
	 char[] ch = s1.toCharArray();
	 String str1 = "";
	 for(char c : ch) {
		 if(s1.indexOf(c) == -1) {
			 s1 = s1+c;
		 }
	 }
	 System.out.println("After removing duplicates character : "+s1);
 }
	public static void main(String[] args) {
		String str = "java programing";
		System.out.println("Before remove duplicate : "+str);
		remove_duplicate(str);
	
	}

}

/* output :
	Before remove duplicate : java programing
	After removing duplicates character : java programing
*/
