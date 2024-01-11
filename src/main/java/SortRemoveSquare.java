import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortRemoveSquare {
    public static void main(String[] args) {
    }

    public static ArrayList<Integer> getSortRemoveSquare(List<Integer> listNumbers){
       ArrayList<Integer> newList = new ArrayList<>();
       Collections.sort(listNumbers);
        System.out.println("Sort List using List sort=" + listNumbers);

        Iterator itr = listNumbers .iterator();
        while (itr.hasNext())
        {
            int x = (Integer)itr.next();
            if (x % 2 != 0)
                itr.remove();
        }
        for(int a:listNumbers) {
            int s = (int)Math.pow(a, 2);
            newList.add(s);
        }
        System.out.println("Final list =" + newList);
        return newList;
    }
}

