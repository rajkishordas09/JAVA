package Java_8_feature.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
//find the 2nd highest length of word in the given sentence
public class Q4 {
    public static void main(String[] args) {
        String s = "i am learning Streams API in java";
        Integer length = Arrays.stream(s.split(" ")).map(String::length).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(length);
    }
}
