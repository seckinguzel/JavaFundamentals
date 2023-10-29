package lambdaFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.forEach(i -> System.out.println(i * i));

        System.out.println("////////////////////////////////////////////////////");

        //We can also take with functional interface
        numbers.forEach((Integer j) -> {
            System.out.println(j * j);
        });

        System.out.println("////////////////////////////////////////////////////");

        List<Integer> dividedByTwo = numbers.stream()
                .filter(k -> k % 2 == 0)
                .map(k -> k / 2)
                .collect(Collectors.toList());
        System.out.println(dividedByTwo);
    }
}
