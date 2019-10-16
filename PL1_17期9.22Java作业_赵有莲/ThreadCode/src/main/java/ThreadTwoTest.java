public class ThreadTwoTest {
    public static void main(String[] args) {
        MyThreadTwo demo = new MyThreadTwo();
        Thread t1 = new Thread(demo,"t1");
        Thread t2 = new Thread(demo,"t2");
        t1.start();
        t2.start();
    }
}
class MyThreadTwo implements Runnable{
    private int count=0;
    private final Object lock = new Object();

    public void run() {
        while (count <= 100){
            synchronized (lock){
                System.out.println(Thread.currentThread().getName() + ':' + count++);
                lock.notifyAll();
                try{
                    if(count <= 100){
                        lock.wait();
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
