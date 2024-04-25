import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    public static void main(String[] args){
         List<String> nameList = Arrays.asList("john, Dave, Gulf");
        nameList.stream().filter(name -> name.startsWith("j"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
