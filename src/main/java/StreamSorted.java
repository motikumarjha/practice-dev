import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {

    public static void main(String[] args) {


        List<Person> listPerson = Arrays.asList(new Person("h", 10),
                new Person("b", 20), new Person("c", 50));

        listPerson.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
        listPerson.forEach(System.out::println);
    }

}

class Person{
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}