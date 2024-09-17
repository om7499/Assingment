package Array_Ass;
// find smallest element
public class _34_Smallest_element {

	public static void main(String[] args) {
		int[] arr = {23,54,26,18,27,35,11,19};
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
		    	}
			}
		}
        System.out.println("Smallest element is : "+arr[0]);
	}
}

//output : 
//           Smallest element is : 11