import java.util.Arrays;
import java.util.List;

public class StartWith {
    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(10, 6, 4, 154, 1167);
        integerList.stream().map(s-> s+"").filter(s->s.startsWith("1")).forEach(System.out::println);

    }

   /* public List<String> getNames(List<String> nameList){

        List<String> names = nameList.stream()
                .map(n -> n.split(""))
                        .filter(s -> s.)
                                .map(s -> s.concat("ing"))
                                .collect(Collectors.toList());
        return names;
    }*/
}
