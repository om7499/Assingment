package String_quation_wpro;

public class _01_CountChar {

	public static void main(String[] args) {
		int count = 0;
		String str = "hello java programing";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total caracter is : "+count);
	}

}
 
// output : 
//             Total caracter is : 19