package Java_8_feature.StreamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;
//remove duplicate  character in a string
public class Q2 {
    public static void main(String[] args) {
        String s1= "aabdccabrf";
      String s2= Arrays.stream(s1.split("")).distinct().collect(Collectors.joining(""));
        System.out.println(s2);

      s1.chars().distinct().mapToObj(ch->(char)ch).forEach(System.out::print);
        System.out.println();
        s1.chars().distinct().forEach(x->System.out.print((char)x));
    }
}
