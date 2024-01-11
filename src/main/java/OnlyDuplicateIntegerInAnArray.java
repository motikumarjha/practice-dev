import java.util.*;
import java.util.stream.Collectors;

public class OnlyDuplicateIntegerInAnArray {
    public static void main(String args[]){

        int[] intarr = {1,2,4,2,3,5,1,2,9,3};
        int len = intarr.length;
        HashMap<Integer, Integer> intMap = new HashMap<>();
        for(int i=0;i<len;i++){
            if(intMap.containsKey(intarr[i])){

                int c = intMap.get(intarr[i]);
                intMap.replace(intarr[i], c + 1);
            }

            // if element is not in map than assign it by 1.
            else
                intMap.put(intarr[i], 1);
        }
        for (Map.Entry<Integer, Integer> i :
                intMap.entrySet()) {

            // print only if count of element is greater
            // than 1.
            if (i.getValue() > 1)
                System.out.println(i.getKey() + " "
                        + i.getValue());

            else
                continue;
        }
    }


        }







      /*  List<Integer> intList  = Arrays.asList(1,2,4,2,3,5,1,2,9,3);
        List<Integer> dupelement = intList.stream().distinct().collect(Collectors.toList());
        System.out.println(dupelement);*/

       /* List<Integer> intList  = Arrays.asList(1,2,4,2,3,5,1,2,9,3);
        Set<Integer> intSet = new HashSet<>();
	    List<Integer> dupelement= intList .stream().filter(s -> intSet.add(s)).collect(Collectors.toList());
        System.out.println(dupelement);*/




