package Java_8_feature.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
//given a sentence ,find the word that has 2nd or nth highest length
public class Q3 {
    public static void main(String[] args) {
        String s = "i am learning Streams API in java";
        String res = Arrays.stream(s.split(" ")).sorted((a, b)->b.length()-a.length()).skip(1).limit(1).collect(Collectors.joining());
        System.out.println(res);

       Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).limit(1).forEach(System.out::println);

    }
}
