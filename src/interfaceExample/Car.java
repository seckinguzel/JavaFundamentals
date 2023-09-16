package interfaceExample;

public class Car implements GetAction {
	@Override
	public void move() {
		System.out.println("Car is moving!");
	}
}
