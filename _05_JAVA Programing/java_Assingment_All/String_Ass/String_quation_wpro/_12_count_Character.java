package String_quation_wpro;

import java.util.Scanner;
//wriate a javaprogram to count the number of charecter in a string

public class _12_count_Character {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter ant string : ");
		String input = in.nextLine();
		int count = 0;
		for(int i=0; i<input.length();i++) {
			if(input.charAt(i)!=' ') {
				count++;
			}
		}
     System.out.println("Total Character are : "+count);
	}

}
/*output : 
	enter ant string : java progaming 
	Total Character are : 13
*/