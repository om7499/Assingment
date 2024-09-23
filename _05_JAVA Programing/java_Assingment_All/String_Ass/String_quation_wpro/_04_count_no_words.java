package String_quation_wpro;
//wriate a javaprogram to count the number of words in a string

import java.util.Scanner;

public class _04_count_no_words {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string");
		String str = sc.nextLine();
		String[] word = str.split(" ");
		System.out.println("Output : "+word.length);

	}

}

/*
	enter any string
	my name is Om Behare
	Output : 5
*/