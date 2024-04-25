import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParalleProcess {
    public static void main(String [] args){
    List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> square = number.parallelStream().map(x -> x * x).filter(x -> x%2 <=0).map(x -> x*x).collect(Collectors.toList());

    System.out.print(square);

}

}
