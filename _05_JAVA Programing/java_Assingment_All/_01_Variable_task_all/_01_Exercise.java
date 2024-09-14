package _01_Variable_task_all;

import java.util.Scanner;

public class _01_Exercise {
    // 1: Calculate the area of a circle.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("radius : ");
		double radius = in.nextDouble();
		double Area_of_cirecle = 3.14*(radius * radius);
      System.out.println("Area of Circle is : "+Area_of_cirecle);		

	}

}
