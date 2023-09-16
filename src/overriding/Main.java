package overriding;

public class Main {
	public static void main(String[] args) {
		BaseCreditManager baseCreditManager = new BaseCreditManager();
		TeachercreditManager teachercreditManager = new TeachercreditManager();
		FarmCreditManager farmCreditManager = new FarmCreditManager();
		StudentCreditManager studentCreditManager = new StudentCreditManager();
		
		System.out.println(baseCreditManager.calculate(36000));
		System.out.println(teachercreditManager.calculate(36000));
		System.out.println(farmCreditManager.calculate(36000));
		System.out.println(studentCreditManager.calculate(36000));
	}
}
