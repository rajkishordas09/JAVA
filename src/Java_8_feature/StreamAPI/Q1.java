package Java_8_feature.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

//find maximun length of word in a sentence
public class Q1 {
    public static void main(String[] args) {
        String s= " hii i am raj kishor das";
      String longest= Arrays.stream(s.split(" ")).reduce("",(a, b)->a.length()>b.length()?a:b);
        System.out.println(longest);

//      String longest1=Arrays.stream(s.split(" ")).max(Comparator.comparing(a->a.length())).get();
      String longest1=Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(longest1);
  //error because it take comparator interface
//      String longest2=Arrays.stream(s.split(" ")).max((a,b)->a.length()>b.length()?a:b).orElse("") ;
//        String longest2=Arrays.stream(s.split(" ")).max() ;
    }
}
