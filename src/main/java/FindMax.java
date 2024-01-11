import java.util.Arrays;
import java.util.List;

public class FindMax {
    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(11, 65, 41, 54,98,98, 67);
      int maxInt =   integerList.stream().max(Integer::compare).get();
      System.out.println(maxInt);
    }
}
