import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 1,16,54, 4, null, 67);
        Set<Integer> dupSet = new HashSet<>();
       // dupSet.add(integerList);
        integerList.stream().filter(n -> dupSet.add(n)).forEach(System.out::println);

      //  integerList.stream().distinct();
        TestModel test = new TestModel();
        test.setNumOfBooks(5);
        test.setBook("CHEM");
        List<TestModel> getModel = Arrays.asList(test);

        Optional.ofNullable(getModel)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(getTestModel ->getTestModel.getBook().equals("CHEM"))
                .forEach(System.out::println);
    }

}
