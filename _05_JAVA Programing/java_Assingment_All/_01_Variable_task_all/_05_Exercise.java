package _01_Variable_task_all;

import java.util.Scanner;

public class _05_Exercise {

	public static void main(String[] args) {
		//5: Calculate the area of a rectangle.
		Scanner in = new Scanner(System.in);
		System.out.println("enter lenght of rectange :");
		int length = in.nextInt();
		System.out.println("enter width of rectange :");
		int width = in.nextInt();
		int Area_of_rect = length * width ;
		System.out.println("Area of rectangle is : "+Area_of_rect);

	}

}
