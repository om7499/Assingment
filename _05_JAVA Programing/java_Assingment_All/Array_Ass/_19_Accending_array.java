package Array_Ass;
//writw a java program sort the elements of an array in ascending order

public class _19_Accending_array {

	public static void main(String[] args) {
		int[] arr = {2,6,8,10,17,15,4,5};
		int temp = 0;
		System.out.print("Original array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Asecending Array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
/*output :
			  Original array : 2 6 8 10 17 15 4 5 
			Asecending Array : 2 4 5 6 8 10 15 17 
*/