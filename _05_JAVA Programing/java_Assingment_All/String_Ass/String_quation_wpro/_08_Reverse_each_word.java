package String_quation_wpro;

import java.util.Scanner;

public class _08_Reverse_each_word {
	//wriate a javaprogram to reverse each word of a given string

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter any string : ");
		String input = in.nextLine();
		String revers = new String();
		for(int i=input.length()-1;i>=0;i--) {
			revers = revers + input.charAt(i);
		}
       System.out.println("Reverse string is : "+revers);
	}

}

/*output : 
	enter any string : Kattapa kill bahubali
	Reverse string is : ilabuhab llik apattaK
*/