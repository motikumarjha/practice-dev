import java.util.*;

public class Sort {
    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(14, 64, 43, 54, 367);
        //ASC
        integerList.stream().sorted().forEach(System.out::println);
        //DSC
        integerList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

        TestModel test = new TestModel();
        test.setNumOfBooks(5);
        test.setBook("CHEM");
        List<TestModel> getModel = Arrays.asList(test);
        //Older way to sort, before java 8
        getModel.sort(new Comparator<TestModel>() {
            @Override
            public int compare(TestModel n1, TestModel n2) {
                return n1.getNumOfBooks()-n2.getNumOfBooks();
            }
        });

    }
}
