package Java_8_feature.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//find the occurance of each word of a given sentence
public class Q5 {
    public static void main(String[] args) {
        String s ="i am learning am api am java stream java api";
        Map<String, Long>map = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting()));//
        System.out.println(map);
    }
}
