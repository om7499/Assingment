package String_quation_wpro;
//wriate a javaprogram to remove all starting and ending spaces from a string

import java.util.Scanner;

public class _07_remove_space {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter any string : ");
		String str = in.nextLine();
		System.out.println("After removing space : " +str.trim());

	}

}

/*output : 
	enter any string :     ombehare     
	After removing space : ombehare
*/