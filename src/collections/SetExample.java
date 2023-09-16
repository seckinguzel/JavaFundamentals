package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Melon");
		fruits.add("Blueberry");
		fruits.add("Apple"); //To writing same element twice a time doesn't work!
		
		for (String i : fruits) {
			System.out.println(i);
		}
		
		System.out.println("///////////////////////////////");
		
		System.out.println(fruits.size());
	}
}
