package interview.prep2024;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//print all the non-repeatable chars from the string
public class FindNonRepeatableCharInString {
    public static void main(String[] args){
        String str = "This book is my one of the favourite book";
        getNonRepeatableCharInString(str);
    }

    public static void getNonRepeatableCharInString(String str){

       Map<String,Long> characterLongHashSet = Arrays.stream(str.split(""))
            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println(characterLongHashSet.entrySet());
       characterLongHashSet.entrySet().stream()
                 .filter(x -> x.getValue() == 1L)
               .map(x -> x.getKey())
               .forEach(System.out::print);
    }

}
