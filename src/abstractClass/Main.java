package abstractClass;

public class Main {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(3, 7);
		
		rectangle.write();
		
		double rectangleArea = rectangle.calculateArea();
		
		System.out.println("Rectangle area= " + rectangleArea);
	}
}
