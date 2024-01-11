
public class TestMe {

    public static void main(String args[]) {
        //12345123
        // 3 ,place value = 3
        //2 ,even number = skip
        //1 odd number = 100

        int number = 12345123;
        System.out.println(getPlaceValue(number));

    }

    public static boolean getPlaceValue(int number) {

        int total = 1, value = 0, rem = 0;
        while (true) {
            rem = number % 10;
            number = number / 10;

            if (rem == 2 || rem == 4 || rem == 6 || rem == 8) {
                System.out.println("skip even numbers place holder");
            } if(rem == 1 || rem == 3 || rem == 5 || rem == 7 || rem == 9) {
                value = total * rem;
                total = total * 10;
                System.out.println(total);

            }


        }

    }


}
