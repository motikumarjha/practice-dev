import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveCommonFromTwoLists {

    public static void main(String[] args){
        Integer[] arr1 = {1,2,3,4,5,6,7,8,9};
        Integer[] arr2 = {5,6,7,8};
        List<Integer> list1 = Arrays.asList(arr1);
        List<Integer> list2 = Arrays.asList(arr2);
        getNew(list1,list2);
    }

    public static List<Integer> getNew(List<Integer> list1, List<Integer> list2){
       int a =  list1.size();
       int b =  list2.size();

       List<Integer> newList = new ArrayList<>();
       for(int i =0;i<a;i++){
           for(int j = 0; j<b;j++){
               if(list1.contains(list2.get(j))){
                   list1.remove(list1.get(i));

               }
System.out.println("here we go: " + list1);
           }
       }

        return newList;

    }
}
