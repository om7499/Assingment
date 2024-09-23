package String_quation_diloite;

public class _20_check_palindrom {
	  
	public static void main(String[] args) {
     String name = "kanak";
     String str1 = name;
     String rev = "";
    for(int i=str1.length()-1;i>=0;i--) {
    	rev= rev+str1.charAt(i);
    }
    if(name.equals(rev)) {
    	System.out.println("it is palindrom");
    }
    else {
    	System.out.println("not palindrom");
    }
				
	}

}

/* output : 
	it is palindrom
*/
