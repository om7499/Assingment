package String_quation_wpro;
//WAP to find the first repeated and non-repeated charecter in the given string

import java.util.Scanner;

public class _11_First_rep_non_rep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter ant string : ");
		String str = in.nextLine();
		
		char firstRepchar =' ';
		char firstNonrepchar=' ';

		
		for(int i=0;i<str.length();i++) {
		 char temp = str.charAt(i);
		 if(temp != ' ') {
			 if(str.indexOf(temp)==str.lastIndexOf(temp)) 
			 {
				 if(firstNonrepchar == ' ') 
					 firstNonrepchar  = temp;
			 }
			 else if(firstRepchar == ' ')
				 firstRepchar = temp;
			 
					 if(firstNonrepchar != ' ' && firstRepchar != ' ') 
						 break; 
	        	 }
		}
		System.out.println("first repeated char : "+firstRepchar);
		System.out.println("first non repeated char :  "+firstNonrepchar);
		
	}

}
/* output :
	enter ant string : ombehare
	first repeated char : e
	first non repeated char :  o
*/
