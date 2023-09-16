package overriding;

public class StudentCreditManager extends BaseCreditManager {
	public double calculate(double cost) {
		return 1.10 * cost;
	}
}
