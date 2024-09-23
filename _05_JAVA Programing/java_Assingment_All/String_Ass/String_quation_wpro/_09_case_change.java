package String_quation_wpro;
//wriate a java program to modify the string in the following pattern
//in:this is hello world   out: THIS si HELLO dlrow

import java.util.Scanner;

public class _09_case_change {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter any string : ");
		String str = in.nextLine();
		String[] words = str.split(" ");
		String result = "";
		for(int i=0;i<str.length();i++) {
			String word = words[i];
			if(i % 2 == 0) {
				result = result + word.toUpperCase();
			}
			else {
				result = result+word.toLowerCase();
			}
		}

	}

}
