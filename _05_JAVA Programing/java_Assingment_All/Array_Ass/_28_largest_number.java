package Array_Ass;

public class _28_largest_number {

	public static void main(String[] args) {
		int[] arr = {4,6,8,7,9,2,12,18,1};
        int large = arr[1];
        for(int i=0;i<arr.length;i++) {
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[i]<arr[j]) {
        			large = arr[j];
        		}
        	}
        }
        System.out.println("largest number is : "+large);
	}

}

//output :
//          largest number is : 18