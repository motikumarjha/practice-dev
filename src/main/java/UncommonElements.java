import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class UncommonElements {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] arr2 = {1, 2, 3, 4};
        List<Integer> list1 = Arrays.asList(arr1);
        List<Integer> list2 = Arrays.asList(arr1);

        CopyOnWriteArrayList<Integer> list3 = new CopyOnWriteArrayList<>();
        list3.add(1);
        list3.add(3);
        list3.add(2);
        CopyOnWriteArrayList<Integer> list4 = new CopyOnWriteArrayList<>();
        list4.add(1);
        //getUnmatchedData(list1, list2);
        // getData(list1,list2);
        allTry(list3,list4);

    }

    public static List<Integer> getUnmatchedData(List<Integer> list1, List<Integer> list2) {
        Set<List<Integer>> unique = new HashSet<>();
        List<Integer> unMatched = list1.stream().filter(x -> !(list1.contains(x))).collect(Collectors.toList());
        System.out.println("List1 has these data as unique : " + unMatched);
        return unMatched;
    }

    public static Set<Integer> getData(List<Integer> list1, List<Integer> list2) {
        Set<Integer> uncommon = list1.stream().distinct().filter(x -> list1.remove(list2)).collect(Collectors.toSet());
        System.out.println("List1 has these data as unique : " + uncommon);
        return uncommon;
    }

    public static void allTry(CopyOnWriteArrayList<Integer> list1, CopyOnWriteArrayList<Integer> list2) {
        for (Integer a : list2) {
            if (list1.contains(a))
                list1.remove(a);
        }
        System.out.println("output");
        System.out.println(list1);
    }

}
