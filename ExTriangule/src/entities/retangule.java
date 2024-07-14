package entities;

public class retangule {
	public double width, height, hip;
	
	public double Area() {
		return width * height;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	public double Perimeter() {
		return (width + height) * 2;
	}
}
