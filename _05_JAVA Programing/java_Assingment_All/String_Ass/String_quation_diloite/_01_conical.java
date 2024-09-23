package String_quation_diloite;
//Write a program to get the canonical representation of the string object

public class _01_conical {

	public static void main(String[] args) {
		{
			String str1 = "Java Exercises";
			String str2 = new StringBuffer("Java").append(" Exercises").toString();
			// it adds the string to the pool and then returns its reference.
			String str3 = str2.intern();
	 
			System.out.println("str1 == str2 ? " + (str1 == str2));
			System.out.println("str1 == str3 ? " + (str1 == str3));
		}


	}

}
