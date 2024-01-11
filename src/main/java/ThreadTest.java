

public class ThreadTest {
    public static void main(String args[]) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        YourThread th = new YourThread();
        Thread th1 = new Thread(th);
        Thread th2 = new Thread(th);

        thread1.start();
        thread2.start();
    }
}

class MyThread extends Thread{
    public void run(){
        Thread thread = Thread.currentThread();
        for(int i =0; i<=5; i++){
            System.out.println(thread.getName());

            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class YourThread implements Runnable{

    @Override
    public void run() {

    }
}