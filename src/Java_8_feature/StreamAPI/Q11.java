package Java_8_feature.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Sort a List
public class Q11 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,3,8,1,9,2);
        System.out.println(list);
        List<Integer> result= list.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
