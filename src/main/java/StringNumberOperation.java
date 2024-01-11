public class StringNumberOperation {
    public static void main(String[] args){
        String input = " Hello6 9World 2, Nic8e D7ay! ";
        int output = NumberSearch(input);
        System.out.println("Final count is " + input + " is " + output);

    }

    private static int NumberSearch(String inputString) {

        int length = inputString.length();

        int digitsSum = 0;
        String temp = "0";
        int count = 0;
        int finalCount = 0;

        for (int i = 0; i < length; i++) {
            if (Character.isLetter(inputString.charAt(i)))
                count++;
        }
        for (int i = 0; i < length; i++) {
            char character = inputString.charAt(i);
            boolean isDigit = Character.isDigit(character);
            if (isDigit) {
                temp = temp + character;
            } else {
                digitsSum = +Integer.parseInt(temp);
                finalCount = digitsSum%count;
            }

        }
        digitsSum = +Integer.parseInt(temp);
        finalCount = digitsSum%count;

        return finalCount;

    }
}
