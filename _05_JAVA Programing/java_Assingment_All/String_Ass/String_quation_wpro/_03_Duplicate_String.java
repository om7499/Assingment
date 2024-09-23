package String_quation_wpro;

public class _03_Duplicate_String {

	public static void main(String[] args) {
         String name = "om Shrikrushna behare";
         char sarr[] = name.toCharArray() ;
         int count=0;
         System.out.print("Duplicate caharater are : ");
         for(int i=0;i<name.length();i++) {
        	for(int j=i+1;j<name.length();j++) {
        		if(sarr[i]==sarr[j] && sarr[i] != ' ') {
        			count++;
        			sarr[j] = 0;
        		}	
        	}
        	if(count > 1 && sarr[i] != '0') {
     			System.out.print(" "+sarr[i]);
     		}
         }
         System.out.println();
         System.out.println( "Total count is : "+count);
	}

}
// Duplicate caharater are : h r i k u s n a b e
// Total count is : 17

