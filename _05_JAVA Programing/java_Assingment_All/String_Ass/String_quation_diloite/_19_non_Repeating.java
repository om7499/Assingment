package String_quation_diloite;

public class _19_non_Repeating {

	public static void main(String[] args) {
		String str = "java";
		System.out.println("original string : "+str);
		for(int i=0;i<str.length();i++) {
			boolean u = true;
			for(int j=0;j<str.length();j++) {
				if(i != j && str.charAt(i) == str.charAt(j)) {
					u = false;
					break;
				}	
			}		
			if(u) {
				System.out.println(str.charAt(i));
			}
		}
	}
}

/*output :
	original string : java
	j
	v
*/