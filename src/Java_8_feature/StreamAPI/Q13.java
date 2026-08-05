package Java_8_feature.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//display Strings with Specific Prefix "An"
public class Q13 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Anime", "Charlie");
        System.out.println(names);
        List<String> result= names.stream().filter(str->str.endsWith("ie")).toList();
        System.out.println(result);
    }
}
