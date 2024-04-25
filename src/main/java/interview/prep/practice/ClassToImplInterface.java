package interview.prep.practice;

public class ClassToImplInterface implements MyInterface1, MyInterface2,CheckInterface{
    @Override
    public void getMe() {

    }

    @Override
    public void findMe() {
        MyInterface1.super.findMe();
    }
}
