package String_quation_diloite;

import java.util.Scanner;

// minimum string 
public class _18_minimum_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any string : ");
		String s1 = sc.nextLine();
		System.out.print("enter any string : ");
		String s2 = sc.nextLine();
		int leng1 = s1.length();
		int leng2 =  s2.length();
		if( leng1 > leng2) {
			System.out.println("minimum string is : "+s2);
		}
		else if(leng2 > leng1) {
			System.out.println("minimun string is : "+s1);
		}
		else {
			System.out.println("all are same length");
		}
	}

}

/*output :
	enter any string : javaprograming
	enter any string : pythonprograming
	minimun string is : javaprograming
*/

