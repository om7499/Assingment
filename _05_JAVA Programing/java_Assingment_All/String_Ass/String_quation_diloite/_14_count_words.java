package String_quation_diloite;
//Write a program to Count words in Given String

import java.util.Scanner;

public class _14_count_words {

	public static void main(String[] args) {
		String str = "we all are in the same class";
		int count = 0;
		String[] s1 = str.split(" ");
		
		for(int i=0; i<s1.length;i++) {
			count++;
		}
		System.out.println("Total number of word is : "+count);
	}
}

/* output :
 * Total number of word is : 7
 */

