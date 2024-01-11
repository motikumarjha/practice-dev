import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMapReturnTest {
    public static void main(String[] args){
        List<Integer> aList = Arrays.asList(1,2,3,4,5);
        List<String> words = Arrays.asList("MotiKumar", "DevMotiJha");
        char[] charArr = words.get(0).toCharArray();
        int c = 0;
        for(int i=0;i<charArr.length;i++){
            if(charArr[i] != 1 ){
                c++;
            }
            System.out.println(c);

        }
        System.out.println("charArr : "+charArr.toString());
        long letterCount = words.stream().filter(s -> s.toCharArray().equals(charArr)).count();
        System.out.println("Word count :" + letterCount);
        long count = aList.stream().count();
        System.out.println("count of  numbers :" +count);
        List<Integer> num = aList.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println("return of map() :"+ num);

        Optional<Integer> reduceFunction =  aList.stream().filter(a -> a%2==0).reduce((a1, a2) -> a1.intValue() > a2.intValue() ? a1 : a2);
        System.out.println("reduce() call :" + reduceFunction);
    }

}
