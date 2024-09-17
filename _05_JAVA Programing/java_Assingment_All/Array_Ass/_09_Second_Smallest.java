package Array_Ass;

public class _09_Second_Smallest {

	public static void main(String[] args) {
		int[] arr = {1,3,6,4,8,2,9,5};
		int len = 8;
		_09_Second_Smallest ss = new _09_Second_Smallest();
		ss.Smallest(arr ,len);
		System.out.println();
		System.out.println("second Smallest is : "+arr[1]);
	}
	int Smallest(int[] arr, int len) {
		int temp;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[1];
	}
}
// output : 
//             second Smallest is : 2
