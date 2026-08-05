package Java_8_feature.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Count Strings with Specific Prefix "A"
public class Q12 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        Long res= names.stream().filter(str->str.startsWith("A")).count();
        System.out.println(res);
        Long res1= names.stream().filter(str->str.startsWith("A")).collect(Collectors.counting());
        System.out.println(res1);
    }
}
