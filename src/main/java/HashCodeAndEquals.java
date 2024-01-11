import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEquals {
    public static void main(String[] args) {

        Customer customer1 = new Customer(11, "moti", "Bangalore");
        Customer customer2 = new Customer(11, "moti", "Bangalore");

        Map<Customer, String> hashmap = new HashMap<Customer, String>();
        hashmap.put(customer1, "one");
        hashmap.put(customer2, "two");


        System.out.println("check the equality : " + customer1.equals(customer2));
        System.out.println("check the hashcode : " + customer1.hashCode());
        System.out.println("check the hashcode : " + customer2.hashCode());
        System.out.println("" + hashmap);

    }

}

class Customer{
    int id;
    String name;
    String address;

    public Customer(int id, String name, String address){
        this.id = id;
        this.name = name ;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //override equals

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if (!(obj instanceof Customer)){
            return false;
        }
        Customer other = (Customer) obj;
        return Objects.equals(id, other.id );
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}