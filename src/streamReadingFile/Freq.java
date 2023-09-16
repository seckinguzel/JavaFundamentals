package streamReadingFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Freq {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("/Users/seckinguzel/Documents/Intelij Idea Projects/Core Java/JavaTeamEducationGettingDeeperPart/src/_7Streams/words.txt"); //In here words.txt file path has to be declare!
        Map<String, Long> freq;

        try(Stream<String> words = new Scanner(file).tokens()){
            freq = words.collect(groupingBy(String :: toLowerCase, counting()));
        }
        System.out.println(freq);
    }
}
