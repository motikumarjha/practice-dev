package interview.prep2024;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PalindromeJava8 {
    public static void main(String[] args){
        String str = "radar";
    }

    public static void isPallindrom(String str){
        Stream.of(str.split("")).map(String::toUpperCase).collect(Collectors.joining());
      //  Stream.of(str.split("")).map(String::toUpperCase).map(Collections::reverseOrder).collect(Collectors.joining());
      //  IntStream.range(0, str.length()/2).noneMatch(a -> a.charAt(a) != a.charAt(a.length() -a-1));

    }
}
