public class Recursion {


    public static void main(String args[]){

        Hello hello = new Hello();

        System.out.println("factoial of n {} is :" + hello.factorial(3));
    }
}

class Hello{
    long factorial(int n){
        if(n==1 || n==0){
            return 1;
        }else{
            long fact = n* factorial(n-1);
            return fact;
        }

    }
}
