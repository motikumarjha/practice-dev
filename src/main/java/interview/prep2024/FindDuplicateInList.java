package interview.prep2024;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//How to find duplicate elements in a given integers list in java using Stream functions?
public class FindDuplicateInList {
    public static void main(String[] args){
        List<Integer> intList = Arrays.asList(13,12,45,46,67,67,45,787);
        Set<Integer> intSet = new HashSet<>();
       // intList.stream().distinct().forEach(System.out::println);
        intList.stream().filter(x -> !intSet.add(x)).forEach(System.out::println);
    }
}
