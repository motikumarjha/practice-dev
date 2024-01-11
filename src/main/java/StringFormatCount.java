public class StringFormatCount {
    public static void main(String[] str){
        String number = "[1,2,3]";
        getSum(number);
    }
    public static int getSum(String number){
        String temp = "0";
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);

            if (Character.isDigit(ch))
                temp += ch;
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        System.out.println(sum + Integer.parseInt(temp));
        return sum + Integer.parseInt(temp);
    }
    }

