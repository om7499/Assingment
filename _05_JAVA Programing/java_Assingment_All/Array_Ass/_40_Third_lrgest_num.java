package Array_Ass;

public class _40_Third_lrgest_num {

	public static void main(String[] args) {
		int[] arr = {2,5,7,3,4,9,1};
		int temp =0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Third largest nuber is : "+arr[2]);
	}

}

// output : 
//           Third largest nuber is : 5
