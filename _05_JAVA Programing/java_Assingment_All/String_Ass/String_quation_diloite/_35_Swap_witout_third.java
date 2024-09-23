package String_quation_diloite;
//Write a program to Swap Two Strings without Third String Variable

public class _35_Swap_witout_third {

	public static void main(String[] args) {
		String str1 = "ombehare";
		String str2 = "jaybehare";
		  System.out.println("Before swap : "+str1);
		  System.out.println("Before Swap : "+str2);
		   str2 = str1+str2;
		   str1 = str2.substring(0,str1.length());
		   
		   str2 = str2.substring(str1.length());
			System.out.println("After swap : "+str1);
			System.out.println("After Swap : "+str2);
		        

	}

}

/* output :
Before swap : ombehare
Before Swap : jaybehare
After swap : ombehare
After Swap : jaybehare
*/