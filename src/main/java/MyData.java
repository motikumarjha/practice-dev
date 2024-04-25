/*
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyData {
    public static void main(String[] args){
        List<Integer> intList = Arrays.asList(1,2,11,12,3,4,100,111,1,2,4);
        HashSet<Integer> dupHash = new HashSet<>();
        //to print the duplicate
       // intList.stream().filter(n -> !dupHash.add(n)).forEach(System.out::println);
        //intList.stream().distinct().forEach(System.out::println);
        //unique values

       // ConcurrentHashMap<Integer,Long> uniqueMap = new ConcurrentHashMap();

       // uniqueMap =   intList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).forEach(Collections::);

     //numbers starting with 1
        intList.stream().map(n -> n + "").filter(a -> a.startsWith("1")).forEach(System.out::println);
         HashMap<Employees, String map =
                 map.put(customKey, value);
         EMployee
                 new Employees("IBM" 74845)
        //to print max number using stream

      // int maxNum =  intList.stream().max(Comparator::compare).get();
      int maxNumber =   intList.stream().max(Integer::compare).get();
      System.out.println("the max number is : " + maxNumber);

      //kafka producer
        //

        @KafkaListner
        public List<String> consume(List<String>){
            KafkaConsumerConfig config = new kafkaConsumerConfig("Topic", "group-id")


        }




    }
}
*/
