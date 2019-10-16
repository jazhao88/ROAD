public class ThreadOneTest {
    public static void main(String[] args) {
        Thread t1 = new MyThreadOne();
        Thread t2 = new MyThreadOne();
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}

class MyThreadOne extends Thread{
    public void run(){
        int i;
        for (i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + ':' + i);
        }
    }
}
