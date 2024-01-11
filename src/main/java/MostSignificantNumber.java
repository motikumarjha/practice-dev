public class MostSignificantNumber {
    public static void main(String[] args){
        int num = 743;
        checkOrder(num);
    }
    public static int checkOrder(int num) {
        int temp = num;
        int dig = temp % 10;
        temp = temp / 10;
        int val = 0;
        while (temp > 0) {
            if (dig <= temp % 10) {
                val = -1;
                break;
            }
            dig = temp % 10;
            temp = temp / 10;
        }
        if (val == -1){
            System.out.println(num + " MSD is not greater than other digits");
        return -1;
    }else
            System.out.println(num+" MSD is greater than other digits");
        return 1;
    }
}
