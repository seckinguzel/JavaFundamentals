package otpMessage;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        /*for (int i=0; i<10; i++) {
            System.out.println(generateOtp());
        }*/

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> numbers = IntStream.rangeClosed(1, 9)
                .boxed()
                .toList(); //It will create an Integer list between 1 and 9

        numbers.forEach(i -> System.out.println(generateOtp()));
    }

    public static String generateOtp() {
        return new DecimalFormat("000000")
                .format(new Random().nextInt(999999));
    }
}
