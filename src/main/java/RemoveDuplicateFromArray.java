import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromArray {

    public static void main(String args[]){
        //normal array declaration
        int[] arr= {1,2,4,2,3,5,1,2,9,3};
        /*//array declaration by new
        int[] intArr = new int[] {1,1,2,2,4,4,4,5,6,6,6,7,8,9};

        //only this way can be converted to Arrays.asList();
        Integer[] arrayInt = new Integer[] {3,3,3,3,3,5,5,5,5,6,6,7,8,9};
        List<Integer> integerList = Arrays.asList(arrayInt);*/
        Arrays.stream(arr).distinct().forEach(System.out::println);
    }

    static void removeDup(int[] arr){
        int len = arr.length;
        for(int i = 0; i<len; i++){
            for(int j = i+1; j<len; j++){
                if(arr[i] == arr[j]){
                    i--;
                    j--;

                }

            }
        }
    }
}

