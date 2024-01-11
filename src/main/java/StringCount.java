import java.util.HashMap;
import java.util.Map;

public class StringCount {
        public static void main(String str[]) {
            String[] testStr = {"AA", "BB", "CC", "AA", "AA"};
            countAndPrintRepeatedWordOccurences(testStr);
        }

        public static void countAndPrintRepeatedWordOccurences(String[] strContent) {
            //using HashMap to remove the duplicate keys
            Map<String, Integer> mapOfRepeatedWord =
                    new HashMap<String, Integer>();
            for (String word : strContent) {
                if (mapOfRepeatedWord.containsKey(word)) {
                    mapOfRepeatedWord.put(word,
                            mapOfRepeatedWord.get(word) + 1);
                } else {
                    mapOfRepeatedWord.put(word, 1);
                }
            }
            System.out.println(" : \n");
            System.out.println("Words" + "\t" + "Count");
            System.out.println("===" + "\t\t" + "===");
            for (Map.Entry<String, Integer> entry :
                    mapOfRepeatedWord.entrySet()) {
                System.out.println(entry.getKey()
                        + "\t\t" + entry.getValue());
            }

        }
    }


