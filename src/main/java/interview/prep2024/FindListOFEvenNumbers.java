package interview.prep2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
public class FindListOFEvenNumbers {
    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(1,2,3,6,8,5,77,88,99);
        getEvenNumbers(integerList);

    }

    public static List<Integer> getEvenNumbers(List<Integer> integerList){

        List<Integer> evenNumList =   integerList.stream().filter(x -> x%2 == 0)
             //   .forEach(System.out::println)
                .collect(Collectors.toList());
        System.out.println("even numbers are : " + evenNumList);
        return evenNumList;
    }
}
