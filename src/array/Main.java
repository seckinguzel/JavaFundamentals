package array;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		int numbers[] = new int[] {1, 2, 3}; //Boundaries has been determined.
		
		System.out.println(numbers[0]);
		
		System.out.println("//////////////////////////////////////////////////////////");
		
		ArrayList numberArrayList = new ArrayList(); //We have been declared as a object.
		
		numberArrayList.add(1);
		numberArrayList.add(2);
		numberArrayList.add("Seckin");
		
		System.out.println(numberArrayList.size());
		System.out.println(numberArrayList.get(2));
		
		System.out.println("//////////////////////////////////////////////////////////");
		
		for (Object i : numberArrayList) {
			System.out.println(i);
		}
	}
}
