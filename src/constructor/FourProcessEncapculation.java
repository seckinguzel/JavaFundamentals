package constructor;

public class FourProcessEncapculation {
	private double number1;
	private double number2;
	
	public FourProcessEncapculation(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public FourProcessEncapculation() {
	}

	public double gather() {
		return number1 + number2;
	}
	
	public double subtraction() {
		return number1 - number2;
	}
	
	public double multiply() {
		return number1 * number2;
	}
	
	public double divide() {
		return number1 / number2;
	}

	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}
}
