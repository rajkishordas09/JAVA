package Java_8_feature.StreamAPI;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        String s="i am learning streams api in java";
        Arrays.stream(s.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==2).forEach(System.out::println);

    }
}
