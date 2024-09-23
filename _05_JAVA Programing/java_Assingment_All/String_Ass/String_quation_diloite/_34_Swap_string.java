package String_quation_diloite;
//Write a program to Swap Two Strings

public class _34_Swap_string {

	public static void main(String[] args) {
		String str1 = "om";
		String str2 = "jay";
		System.out.println("Before swap : "+str1);
		System.out.println("Before Swap : "+str2);
		   String temp = str1;
		   str1 = str2;
		   str2 = temp;	 
			System.out.println("After swap : "+str1);
			System.out.println("After Swap : "+str2);
		        
		
	}

}

/* output :
Before swap : om
Before Swap : jay
After swap : jay
After Swap : om
*/