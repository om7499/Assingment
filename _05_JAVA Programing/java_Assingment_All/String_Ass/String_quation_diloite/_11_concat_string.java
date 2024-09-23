package String_quation_diloite;
//Write a program to concatenate Two strings

public class _11_concat_string {
   public void concate(String str1,String str2) {
	   if(str1.length() != 0 && str2.length() != 0 && str1.indexOf(-1) == str2.indexOf(0)) {
		   System.out.println(str1.concat(str2.substring(1)));
	   }
	   else {
		   System.out.println(str1+str2);
	   }
   }
	public static void main(String[] args) {
		 String str1 = "mark";
		 String str2 = "kate";
		 _11_concat_string cs = new _11_concat_string();
		 cs.concate(str1, str2);
		 
	}

}

/*output :
    markate
*/