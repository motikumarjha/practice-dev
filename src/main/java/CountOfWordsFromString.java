import java.util.HashMap;
import java.util.Map;

public class CountOfWordsFromString {
    public static void main(String str[]) {

       // String testStr = "Science blank Maths blank blank";
        String testStr = "Science blank Maths blank blank";
        countAndPrintRepeatedWordOccurences(testStr);


    }

    public static void countAndPrintRepeatedWordOccurences(
            String strContent) {
        // Step 1: create Map of String-Integer
        Map<String, Integer> mapOfRepeatedWord =
                new HashMap<String, Integer>();

        // Step 2: split line using space as delimiter
        String[] words = strContent.split(" ");

        // Step 3: iterate through String[] array
        for (String word : words) {

            // Step 4: convert all String into lower case,
            // before comparison
            String tempUCword = word.toLowerCase();

            // Step 5: check whether Map contains particular word
            if (mapOfRepeatedWord.containsKey(tempUCword)) {

                // Step 6: If contains, increase count value by 1
                mapOfRepeatedWord.put(tempUCword,
                        mapOfRepeatedWord.get(tempUCword) + 1);
            } else {

                // Step 7: otherwise, make a new entry
                mapOfRepeatedWord.put(tempUCword, 1);
            }
        }

        System.out.println("Before sorting : \n");
        System.out.println("Words" + "\t\t" + "Count");
        System.out.println("======" + "\t\t" + "=====");

        // Step 8: print word along with its count
        for (Map.Entry<String, Integer> entry :
                mapOfRepeatedWord.entrySet()) {
            System.out.println(entry.getKey()
                    + "\t\t" + entry.getValue());
        }

    }
}
