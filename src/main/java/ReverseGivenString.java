import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// programe to reverse a String,
// Moti, revString = itoM
public class ReverseGivenString {
    public static void main(String[] args){

        String input = "Hi Moti Kumar Hello";
        getReversedString(input);
        withRevFuntion(input);

    }

    public static String getReversedString(String input){
        String str =  Stream.of(input).map(word ->new StringBuilder(word).reverse()).collect(Collectors.joining());
    System.out.println("rev string is : " + str);
    return str;
    }

    public static void withRevFuntion(String inputString) {
        int len = inputString.length();
        char ch ;
        String revstr = "";

        for(int i = 0; i<len; i++){
            ch = inputString.charAt(i);

             revstr = ch + revstr;
        }
        System.out.println("reverse string is: " + revstr);

    }


}
