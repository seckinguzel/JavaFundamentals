package constructor;
public class Main {
	public static void main(String[] args) {
		FourProcessEncapculation fourProcessEncapculation = new FourProcessEncapculation();
		
		fourProcessEncapculation.setNumber1(7);
		fourProcessEncapculation.setNumber2(3);
		
		System.out.println(fourProcessEncapculation.gather());
		System.out.println(fourProcessEncapculation.subtraction());
		System.out.println(fourProcessEncapculation.multiply());
		System.out.println(fourProcessEncapculation.divide());
		
		System.out.println("///////////////////////////////////////////////////////");
		
		FourProcess fourProcess = new FourProcess();
		
		System.out.println(fourProcess.gather(100, 37));
		System.out.println(fourProcess.subtract(100, 37));
		System.out.println(fourProcess.multiply(100, 37));
		System.out.println(fourProcess.divide(100, 37));
	}
}
