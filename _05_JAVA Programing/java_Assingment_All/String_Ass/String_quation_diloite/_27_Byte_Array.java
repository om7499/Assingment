package String_quation_diloite;
//Write a program to get the contents of a given string as a byte array

public class _27_Byte_Array {

	public static void main(String[] args) {
		String str = "this is sample string ";
		byte[] arr = str.getBytes();
		String str1 = new String(arr);
		System.out.println("the new String is : "+str1);

	}

}


/* output :
the new String is : this is sample string 
*/