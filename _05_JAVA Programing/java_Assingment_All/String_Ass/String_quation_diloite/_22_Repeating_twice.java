package String_quation_diloite;
//Write a program to replace a specified character with another character

public class _22_Repeating_twice {

	public static void main(String[] args) {
		String str = "javaprograming";
		System.out.println("Before replace : "+str);
		 str = str.replace('p', 'd');
		System.out.print("After replace : "+str);

	}

}

/* output :
	Before replace : javaprograming
	After replace : javadrograming
*/