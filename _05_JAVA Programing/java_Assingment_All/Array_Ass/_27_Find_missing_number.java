package Array_Ass;

public class _27_Find_missing_number {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6};
		int exp_number = arr.length+1;
		int sum_of = exp_number * (exp_number +1)/2;
		int sum = 0,miss_num;
        for(int i=0;i<arr.length;i++) {
        	sum = sum+arr[i];
        }
        miss_num = sum_of - sum;
        System.out.println("missing number is : "+miss_num);
	}

}

//output :
//       missing number is : 5