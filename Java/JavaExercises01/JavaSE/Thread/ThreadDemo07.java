package Thread;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo07 {
    public static void main(String[] args) {
        Window4 w = new Window4();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Window4 implements Runnable {
    private int num = 100;//静态变量被所有对象成员共享

    //创建lock对象
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true) {
            try {
                //启用lock锁   单线程 排队
                lock.lock();
                if(num > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票，票号：" + num);
                    num --;
                } else return;
            } finally {
                //解开lock锁
                lock.unlock();
            }
        }
    }
}