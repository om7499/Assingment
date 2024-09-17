package Array_Ass;

public class _41_Create_methot_third_largest {

	public static void main(String[] args) {
		
		int a[] = { 22, 36, 79, 87, 10, 32,60,53};
		System.out.println("Third largest is : "+_41_Create_methot_third_largest.thirdLargest(a, 8));

	}
	public static int thirdLargest(int[] arr ,int leng) {
		int temp =0;
		for(int i=0;i<leng;i++) {
			for(int j=i+1;j<leng;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[2];
	}
}

//output : 
//          Third largest is : 60
