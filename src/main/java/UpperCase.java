import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args){
        List<String> names = Arrays.asList("aa", "bb", "cc", "dd");

        names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
