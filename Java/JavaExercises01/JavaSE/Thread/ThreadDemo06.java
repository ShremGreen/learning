package Thread;
/*
死锁
不同的线程都在执行，并且分别占用了对方的资源，所有线程都处于阻塞状态。
但是此时执行结果不会返回异常。

本类中，
通过sleep将死锁的概率扩大。死锁时，一个线程卡在s1锁中，另一个线程卡在s2锁中。
 */
public class ThreadDemo06 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        //线程1   匿名内部类 继承Thread
        new Thread() {
            @Override
            public void run() {
                synchronized(s1) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    s1.append("a");
                    s2.append("1");
                    synchronized (s2) {
                        s1.append("b");
                        s2.append("2");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();

        //线程2   匿名内部类 实现Runnable接口
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s2) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    s1.append("c");
                    s2.append("3");
                    synchronized(s1) {
                        s1.append("d");
                        s2.append("4");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }).start();
    }
}
