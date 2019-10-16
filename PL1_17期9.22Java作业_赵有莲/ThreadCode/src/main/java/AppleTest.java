public class AppleTest {
    public static void main(String[] args) {
        TakeApple takeApple = new TakeApple();
        Thread person1 = new Thread(takeApple,"小明");
        Thread person2 = new Thread(takeApple,"小花");
        person1.start();
        person2.start();
    }
}

class TakeApple implements Runnable
{
    private int num = 5;
    private final Object lock = new Object();
    public void run() {
        while (true){
            synchronized (lock) {
                if (num > 0) {
                    --num;
                    System.out.println(Thread.currentThread().getName()
                            + "拿了1个苹果，还剩下的苹果数为：" + num);
                }
               else {
                   break;
                }
            }
        }
    }
}