import java.util.*;

public class DuplicateFromStringArray {
    public static void main(String[] args){
        int[] arr = {2,2,3,1,4,3,2,4};

        List<int[]> list1 = new ArrayList<>();
        list1.add(arr);

        getDup(arr);
        getDuplicate(list1);

    }

    public static void getDup(int[] arr){
        int len = arr.length;
        for(int i=0; i<len; i++){
            for(int j = i+1; j<len; j++){
                if(arr[i] == arr[j]){
                    arr[j] = arr[len-1];
                    len --;
                    j --;
                }
            }

            System.out.println("" + arr[i]);
        }

       // int[] array = Arrays.copyOf(arr,len);
        System.out.println("" + arr);

    }

    public static Set<Integer> getDuplicate(List<int[]> arr){
        Set<Integer> dupSet = new HashSet<>();
        for(int[] a: arr){
           for(int b: a){
               dupSet.add(b);
           }
        }
        System.out.println("removed dup from the given int[] "+ dupSet);
        return dupSet;
    }

    public static Set<Integer> getDuplicateFromList(int[] arr){
        Set<Integer> dupSet = new HashSet<>();
        for(int a: arr){
            dupSet.add(a);
        }
        System.out.println("removed dup from the given int[] "+ dupSet);
        return dupSet;
    }
}
