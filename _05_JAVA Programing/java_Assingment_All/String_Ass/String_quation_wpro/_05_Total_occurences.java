package String_quation_wpro;

import java.util.Scanner;

public class _05_Total_occurences {
//wriate a javaprogram to count the total number of occurences of a
//given charecter in a string

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("eneter any string  :");
		String input = in.nextLine();
		
		System.out.print("enter target character : " );
		char target = in.next().charAt(0);
		int count = 0;
		
		for(int i=0;i<input.length();i++) {
			if(target == input.charAt(i)) {
				count++;
			}
		}
        System.out.println("Total occurence is  : "+count);
	}

}
/*
	eneter any string  :good mornig to all
	enter target character : o
	Total occurence is  : 4
*/