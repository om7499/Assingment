package Inheritance_Task;

class Shape{
	
	double getArea(){
		return 0.0;
	}
	double getPerimeter(){
		return 0.0;
	}
}
class Circle extends Shape{
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	double getPerimeter() {
		return 2 * Math.PI *radius;
	}
}

class Rectangle extends Shape{
	private double length;
	private double width;
	public Rectangle(double length,double width) {
		this.length = length;
		this.width = width;
	}
	double getArea() {
		return length * width;
	}
	
	double getPerimeter() {
		return 2 * (length + width);
	}
}
public class _02_Main {
	public static void main(String[] args) {
		Circle circle = new Circle(14.6);
		System.out.println("Area of circle : "+circle.getArea());
		System.out.println("Perimetrer of circle : "+circle.getPerimeter());
		
		Rectangle rect = new Rectangle(7,9);
		System.out.println("Area of Rectangle  : "+rect.getArea());
		System.out.println("Perimetrer of Rectangle : "+rect.getPerimeter());
	}

}

/* output :
	Area of circle : 669.6618900392002
	Perimetrer of circle : 91.73450548482195
	Area of Rectangle  : 63.0
	Perimetrer of Rectangle : 32.0
*/