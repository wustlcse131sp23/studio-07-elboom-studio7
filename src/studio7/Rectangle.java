package studio7;

public class Rectangle {

	private double width = 0.0;
	private double height = 0.0;
	
	public Rectangle(double x, double y) {
		this.width = x;
		this.height = y;
	}
	
	public double perimeter() {
		return (this.width + this.height) * 2;
	}
	
	public double area() {
		return (this.width * this.height);
	}
	
	public boolean compare(Rectangle r) {
		if (this.area() > r.area()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSquare() {
		if (this.width == this.height) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle uno = new Rectangle (3.4, 3.4);
		Rectangle dos = new Rectangle (5.3, 5.3);
		System.out.println(uno.compare(dos));
		System.out.println(uno.isSquare());
	}

}
