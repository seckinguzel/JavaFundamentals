package streamReadingFile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TestDrive {
    public static void main(String[] args){
        List<String> myList = Arrays.asList("victor hugo", "george orwell", "john steinback", "jules verne");

        myList.stream()
                .filter(j -> j.startsWith("j"))
                .map(String :: toUpperCase)
                .forEach(System.out :: println);

        Arrays.stream(new int[] {1, 2})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out :: println);

        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
        IntStream.range(0, 5).forEach(System.out :: println);

        System.out.println(IntStream.range(0, 10).max().getAsInt());

//        Collection<Integer> a = Collections.emptyList();
//        a.add(10);
//        List<Integer> result = a.stream()
//                .filter(s -> s > 0)
//                .collect(Collectors.toList());
    }
}
