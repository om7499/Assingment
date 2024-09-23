package String_quation_wpro;

import java.util.Scanner;
//wriate a javaprogram to reverse a string
public class _06_Reverse_String {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter any string : ");
		String str = in.nextLine();
		String reverse = new String();
		for(int i=str.length()-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Revers string is : "+reverse);
	}

}
/*
	enter any string : we all are indian
	Revers string is : naidni era lla ew
*/