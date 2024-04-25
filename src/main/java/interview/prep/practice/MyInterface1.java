package interview.prep.practice;

@FunctionalInterface
public interface MyInterface1 {
    public void getMe();
    default void findMe(){
        System.out.println("This is interface 1 default");
    }
}
