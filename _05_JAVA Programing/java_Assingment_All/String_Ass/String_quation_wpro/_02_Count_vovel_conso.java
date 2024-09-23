package String_quation_wpro;

public class _02_Count_vovel_conso {

	public static void main(String[] args) {
		int vCount = 0, cCount = 0;
		String str = "you are very intresting man";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) =='a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) =='u' ) {
				vCount ++;
			}
			else {
				cCount ++;
			}
		}
       System.out.println("Total vovels are : "+vCount);
       System.out.println("Total consonent are : "+cCount);
	}

}
/* output :
          Total vovels are : 9
          Total consonent are : 18
*/