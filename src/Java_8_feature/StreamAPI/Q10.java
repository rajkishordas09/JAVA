package Java_8_feature.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;

//Find Maximum in a List
public class Q10 {
    public static void main(String[] args) {
        Integer []arr={11,4,8,4,9,6,2};
        Integer num1 = Arrays.stream(arr).max((a,b)->a-b).get();
        System.out.println(num1);
        Integer num2 = Arrays.stream(arr).max(Integer::compareTo).get();
        System.out.println(num2);
        Integer num3 = Arrays.stream(arr).max((a,b)->Integer.compare(a,b)).get();
        System.out.println(num3);
        Integer num4 = Arrays.stream(arr).max(Integer::compare).get();
        System.out.println(num4);
    }
}
