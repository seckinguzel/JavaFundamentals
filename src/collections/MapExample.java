package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> fruitsMap = new HashMap<>();
		
		fruitsMap.put("Apple", 1);
		fruitsMap.put("Banana", 2);
		fruitsMap.put("Melon", 3);
		fruitsMap.put("Blueberry", 4);
		
		for (Map.Entry<String, Integer> entry : fruitsMap.entrySet()) {
            String fruit = entry.getKey();
            Integer quantity = entry.getValue();
            System.out.println(fruit + ": " + quantity);
        }
		
		System.out.println("///////////////////////////////");
		
		System.out.println(fruitsMap.size());
	}
}
