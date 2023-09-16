package abstractClass;

public class Rectangle extends Shape {
	private double shortSide;
	private double longSide;
	
	public Rectangle(double shortSide, double longSide) {
		this.shortSide = shortSide;
		this.longSide = longSide;
	}

	@Override
	double calculateArea() {
		return shortSide * longSide;
	}
}
