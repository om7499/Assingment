package String_quation_diloite;

public class _23_replace_substring {

	public static void main(String[] args) {
		String str = " python and python programing";
		System.out.println("Before replacement : "+str);
		
		String str1 = str.replace("python", "java");
		System.out.println("After replacement : "+str1);

	}

}

/* output :
	 Before replacement :  python and python programing
	After replacement :  java and java programing
 */
 