package Java_8_feature.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
//given a sentence ,find the word that has 2nd or nth highest length
public class Q3 {
    public static void main(String[] args) {
        String s = "i am learning Streams API in java";

        String res=Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
        System.out.println(res);
        String res1 = Arrays.stream(s.split(" ")).sorted((a, b)->b.length()-a.length()).skip(1).limit(1).collect(Collectors.joining());
        System.out.println(res1);

//       Arrays.stream(s.split(" ")).sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
//  it reversed lexical order learning
//java
//in
//i
//am
//Streams
//API
    }
}
