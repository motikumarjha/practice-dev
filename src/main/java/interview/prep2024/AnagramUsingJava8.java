package interview.prep2024;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramUsingJava8 {
    public static void main(String[] args){
        String str1 = "Peek";
        String str2 = "Keep";
        checkAnagram(str1, str2);
    }

    public static void checkAnagram(String st1, String st2){
    st1 =    Stream.of(st1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
     st2 =    Stream.of(st2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());


     if(st1.equals(st2)){
         System.out.println("Anagram");
     } else
         System.out.println("not a anagram");
    }
}
