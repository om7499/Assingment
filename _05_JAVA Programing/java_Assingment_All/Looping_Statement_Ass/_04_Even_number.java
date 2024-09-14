package Looping_Statement_Ass;
//Write a program to print all even numbers between 1 to 100

public class _04_Even_number {

	public static void main(String[] args) {
		
    for(int i=1;i<=100;i++) {
    	if(i % 2==0) {
    		System.out.print(i);
    	}
    }
	}

}
