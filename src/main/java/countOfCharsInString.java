import java.beans.IntrospectionException;
import java.util.HashMap;
import java.util.Map;

public class countOfCharsInString {

    public static void main(String args[]){
        String str = "aabbbrrrrnft";
        Map<Character, Integer> charCount = new HashMap<>();

       /* for(char c : str.toCharArray()){
        charCount.merge(c,1, Integer::sum);
        }
        System.out.println("char count : " + charCount);*/

       char[] ch = str.toCharArray();
       for(char c : ch){
           if(charCount.containsKey(c)){
               charCount.put(c, charCount.get(c)+1);
           }else{
               charCount.put(c,1);
           }
       }

       for(Map.Entry entry : charCount.entrySet()){
           System.out.println(entry.getKey()+ " " + entry.getValue());
       }

    }


}
