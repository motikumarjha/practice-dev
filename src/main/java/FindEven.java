import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEven {
    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(1, 6, 4, 54, 67);
    //    integerList.size();
        integerList.stream().filter(s -> s%2 == 0).forEach(System.out::println);
                //map(s -> s%2 == 0).collect(Collectors.toList());
    }
}
