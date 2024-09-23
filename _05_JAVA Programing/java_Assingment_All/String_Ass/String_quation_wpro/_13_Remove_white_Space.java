package String_quation_wpro;
//wriete a java program remove all the white spaces from a string

import java.util.Scanner;

public class _13_Remove_white_Space {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("enter any string : ");
		 String str = in.nextLine();
		str =  str.replace(' ',',');
		 System.out.println("After removing space : "+str);
	}

}
/*output :
	enter any string : java space remove
	After removing space : java,space,remove
*/