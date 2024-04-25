
// programe to reverse a String of sentence, it is diff from reversing the string OR
// reverse the order of the words in a sentence
// Hello Moti Hi, rev string = Hi Moti Hello
// I love you, revString is you love I
public class ReverseSentence {
    public static void main(String[] str){
        String inputStr = "Hello Moti Hi";
        revSentence(inputStr);

    }

    public static void revSentence(String inputStr){
        StringBuilder builder = new StringBuilder();
        String[] words = inputStr.split("");

        for(int i = inputStr.length()-1;i>=0 ;i-- ){
            builder.append(words[i]);
            builder.append(" ");

        }

        System.out.println("Rev string is: " +builder);
    }
}
