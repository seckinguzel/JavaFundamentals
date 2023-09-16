package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Melon");
		fruits.add("Blueberry");
		
		for (String i :fruits) {
			System.out.println(i);
		}
		
		System.out.println("///////////////////////////////");
		
		System.out.println(fruits.size());
	}
}
