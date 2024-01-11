/*
import java.util.HashMap;
import java.util.Map;

public class CountOfGivenWordInAString {
    public static void main(String[] args){
        String completeString = "Everyday is a wonderful day";
        String findCountOfString = "day";
        getCountOfChar(completeString, findCountOfString);
    }

    public static int getCountOfChar(String completeString, String findCountOfString){
        int lenOfcompleteString = completeString.length(); // 30
        int lenOfFinfCountOfString = findCountOfString.length();//3

        char[] chArrayOfOCompleteString = completeString.toCharArray(); // E v e r y d a y  is  a  w o n d e r f u l d a y
        char[] chArrayOfCountString = findCountOfString.toCharArray();// d a y

        Map<String, Integer> copyChar = new HashMap<>();
            for(char c : chArrayOfOCompleteString) {
                if(findCountOfString.contains(c+"")){
                    copyChar.put(c + "", copyChar.get(c) + 1);
                }
                else{
                    copyChar.put(c+"", 1);
                }

            }

        }



        return  0;
    }
}
*/
