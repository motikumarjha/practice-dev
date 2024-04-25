package interview.prep2024;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given a list of integers, find the maximum value element present in it using Stream functions?
public class MaxValueInList {
    public static void main(String[] args){
        List<Integer> intList = Arrays.asList(13,12,45,46,67,67,45,787);
      int maxVal =   intList.stream().max(Integer::compare).get();
      System.out.println(maxVal);

      List<String> stringList = Arrays.asList("", "AA","", "BB", "AA");

        sortedInt(intList);
        concatString(stringList);
        coutOfChar("My name is coidng");

    }

    //Given a list of integers, sort all the values present in it using Stream functions?
    public static List<Integer> sortedInt(List<Integer> sortedList){
     List<Integer> listSorted = sortedList.stream().sorted().collect(Collectors.toList());
     List<Integer> listSort = sortedList.stream().sorted((a,b) -> a.compareTo(b)).collect(Collectors.toList());
      System.out.println("" + listSort);
        return listSort;
    }

    //How to count each element/word from the String ArrayList in Java8

    public static  Map<String, Long> concatString(List<String> stringList){
    Map<String, Long> countOf = stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    System.out.println("" + countOf);
    return countOf;
    }
    //How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?

    public static void isEmpty(List<Integer> list){
        Optional.ofNullable(list)
                .orElse(new ArrayList<>())
                .stream().filter(Objects::nonNull)
                .collect(Collectors.toList());

    }
    //Write a Program to find the Maximum element in an array?

    public static void getMaximum(int[] arr){
        Arrays.stream(arr).max().getAsInt();


    }
//Write a program to print the count of each character in a String?
public static void coutOfChar(String str){
    Map<String, Long> count = Arrays.stream(str.split(""))
              .map(String::toLowerCase)
              //.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
                      .collect(Collectors.groupingBy(x -> x,LinkedHashMap::new,Collectors.counting()));

    System.out.println("char counts :" + count);
}
}

