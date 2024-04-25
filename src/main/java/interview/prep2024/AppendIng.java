package interview.prep2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppendIng {
public static void main(String[] args){

//list of names , find names starting with A, append ing, Avin A V I N
List<String> nameList = Arrays.asList("Moti", "Avil", "Abin");
getNames(nameList);


}

    public static List<String> getNames(List<String> nameList){

        List<String> names = nameList.stream()
                       // .map(n -> n.split(""))
                        .filter(s -> s.startsWith("A"))
                        .map(s -> s.concat("ing"))
                        .collect(Collectors.toList());
        names.stream().forEach(System.out::println);
        return names;
    }
}
