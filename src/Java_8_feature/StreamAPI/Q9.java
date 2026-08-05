package Java_8_feature.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Filter Even Numbers from a List
public class Q9 {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Integer []arr= {1, 2, 3, 4, 5, 6};
        List<Integer> list= Arrays.asList(arr);
        System.out.println(list);

        List<Integer> list1= list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(list1);

        list.stream().filter(x->x%2==0).forEach(System.out::println);
    }
}
