package String_quation_diloite;

public class _24_Reverse_Each_words {

	public static void main(String[] args) {
		String str = "I am java devloper";
		System.out.println("Before reverse : "+str);
	    String[] words = str.split(" ");
	    String result = "";
        for(int i=words.length-1;i>=0;i--) {
        	result = result+words[i];
        }
        System.out.println("After reverse : "+result);
	}

}


/* output : 
	Before reverse : I am java devloper
	After reverse : devloperjavaamI
*/