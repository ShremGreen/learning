package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
线程创建方法四
线程池

 */
class Numcount implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i <= 100; i ++) {
            if(i%2 == 0) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        }
    }
}

class Numcount1 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i <= 100; i ++) {
            if(i%2 != 0) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        }
    }
}

public class NewThread02 {
    public static void main(String[] args) {
        //创建一个线程池；2条线程
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //设置线程池的属性
        System.out.println(executorService.getClass());

        //execute对应Runnable
        executorService.execute(new Numcount());//开始Runnable接口的线程
        executorService.execute(new Numcount1());

        executorService.shutdown();
    }
}
