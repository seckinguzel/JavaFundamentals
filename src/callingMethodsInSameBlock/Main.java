package callingMethodsInSameBlock;

public class Main {
	public static void main(String[] args) {
		findingNumbers();
	}
	
	public static void findingNumbers() {
		int numbers[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int search = 3;
		boolean check = false;
		
		for (int i : numbers) {
			if (i == search) {
				check = true;
				break;
			}
		}
		
		if (check == true) {
			System.out.println("The number is in index!");
		} else {
			System.out.println("The number is not in index!");
		}
	}
}
