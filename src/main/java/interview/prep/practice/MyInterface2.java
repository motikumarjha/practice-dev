package interview.prep.practice;

@FunctionalInterface
public interface MyInterface2 {
    public void getMe();
    default void findMe(){
        System.out.println("This is interface 2 default");
    }
}
