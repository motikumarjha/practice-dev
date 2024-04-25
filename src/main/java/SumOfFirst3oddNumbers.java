import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfFirst3oddNumbers {
    public static void main(String[] args){

        List<Integer> listOfNumebrs = new ArrayList<>();
        listOfNumebrs.add(1);
        listOfNumebrs.add(2);
        listOfNumebrs.add(3);
        listOfNumebrs.add(4);
        listOfNumebrs.add(5);

        getOddSum(listOfNumebrs);

        System.out.println(List.of("MM").containsAll(Arrays.asList("MM")));

    }

    public static int getOddSum(List<Integer> listOfNumebrs) {

        int sum = listOfNumebrs.stream().filter(n -> n % 2 != 0).map(r -> r = r + 2).mapToInt(Integer::intValue).sum();
       System.out.println("sum of the od numbers are : " +sum);
        return sum;
    }
}
