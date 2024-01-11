import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamReduce {

    public static void main(String[] args){

        List<String> listToReduce = Arrays.asList("AA", "BB", "CC", "AA", "AA");
        //get the list of repeated String
        List<String> notCommon =  listToReduce.stream().distinct().collect(Collectors.toList());
        System.out.println("non common string :" + notCommon);
        //get the count of repeated Strings
        long count =  listToReduce.stream().distinct().count();
        System.out.println("after distinct operations() :" + count);

        Optional<String> longestString =  listToReduce.stream()
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);
        Optional<String> combineString = listToReduce.stream().reduce((a1, a2)-> a1 + " " + a2);
        longestString.ifPresent(System.out::println);
        combineString.ifPresent(System.out::println);

    }
}
