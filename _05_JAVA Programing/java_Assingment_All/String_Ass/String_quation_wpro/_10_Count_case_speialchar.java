package String_quation_wpro;
//wriate a javaprogram to find the count of uppercase and lowercase digits and special chrs

import java.util.Scanner;

public class _10_Count_case_speialchar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter any string : ");
		String str = in.nextLine();
		int upperCount = 0;
		int lowerCount = 0;
		int specialCount = 0;
		int digitCount = 0;
		char[] character = str.toCharArray();
		
		for(char ch : character) {
			if(Character.isUpperCase(ch)&& ch != ' ') {
				upperCount++;
			}
			else if(Character.isLowerCase(ch)&& ch != ' ') {
				lowerCount++;
			}
			else if(Character.isDigit(ch)&& ch != ' ') {
				digitCount++;
			}
			else {
				specialCount++;
			}
		}
		System.out.println("UpperCase count is : "+upperCount);
		System.out.println("lowerCase count is: "+lowerCount);
		System.out.println("digit count is : "+digitCount);
		System.out.println("special count is : "+specialCount);
		
	}
}

/*
	enter any string : India is Very Beautifull country#1
	UpperCase count is : 3
	lowerCase count is: 25
	digit count is : 1
	special count is : 5
*/