public class TestAmStrong {
    public static void main(String args[]) {
        int n = 370;
        getAmrStrong(n);
    }

    public static void getAmrStrong(int n) {

        int orgNumber = 0;
        int value = 0;
        String pow = n + "";
        int m = pow.length();
        orgNumber = n;


        while (orgNumber != 0) {
            int rem = orgNumber % 10;
            value += Math.pow(rem, m);
            orgNumber /= 10;
        }
        if (value == n) {
            System.out.println("n is amstrong: " + n);
        } else {
            System.out.println("n is not amstrong: " + n);
        }

    }
}

