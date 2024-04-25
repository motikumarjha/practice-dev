import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastSafeTest {

    public static void main(String args[]) {
       // getNoCCME();
       //getCCME();
        copyOnWriteArraylist();

    }

    public static void getNoCCME(){
        List<Integer> list = getInt();
        Iterator it = list.iterator();
        while (it.hasNext()){
            if(it.next().equals(3)){
                //if we use remove() on iterator obj it
                //willnot throuw the CCME
                it.remove();
                System.out.println("No CCME : " + list);
            }

        }

    }

    public static void copyOnWriteArraylist(){
        CopyOnWriteArrayList<Integer> list =new CopyOnWriteArrayList<Integer>(new Integer[] {11, 22, 33, 44, 55,66});
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println("copy list so do not remove the element");
            if(it.next().equals(33)){
                //if we use remove() on iterator obj it
                //will not throw the CCME
                list.remove(3);
                System.out.println("No CCME : " + list);
            }

        }

    }

    public static void getCCME(){
        List<Integer> list = getInt();
        Iterator it = list.iterator();
        while (it.hasNext()){
            if(it.next().equals(3)){
                //if we use remove() on iterator obj it
                //willnot throuw the CCME
                list.remove(3);
                System.out.println("CCME : " + list);
            }

        }

    }
    
    private static List<Integer> getInt(){
        List<Integer> getIntList = new ArrayList<>();

        getIntList.add(1);
        getIntList.add(2);
        getIntList.add(3);
        getIntList.add(4);
        getIntList.add(5);
        getIntList.add(6);
        getIntList.add(7);

        return getIntList;
        
    }
    }

