import java.lang.reflect.Array;
import java.util.Arrays;
public class MostRepeatedNumber {
    public static void main(String[] args) {
        int arr[] = {8, 1, 6, 10, 2, 3, 7, 4, 5, 9, 6, 8, 1, 6};
        getMax_count(arr);
    }
    public static int getMax_count(int[] arr){
        int element = Integer.MIN_VALUE, max_count = 1, count = 1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                count++;
            if (arr[i] != arr[i - 1] || i == arr.length - 1) {
                if (count > max_count) {

                    max_count = count;
                    element = arr[i - 1];
                }
                count = 1;
            }
        }
        System.out.println("Repeated element from array is: " + element);
        return element;
    }
}
