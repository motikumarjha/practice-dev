import java.util.Arrays;
import java.util.List;

public class StartWith {
    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(10, 6, 4, 154, 1167);
        integerList.stream().map(s-> s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
    }
}
