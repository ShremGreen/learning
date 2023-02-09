package Thread;
/*
创建线程的第三种方式  实现Callable接口
1.创建Callable接口实现类并重写call方法（抛异常、返回Object）
2.构建实现类的实例；将该对象传递到FutureTask的带参构造器中，创建FutureTask对象
3.将FutureTask对象作为参数传递到Thread带参构造中并创建Thread对象，调用start方法
4.若需要call方法的返回值，可通过FutureTask对象的get方法获取返回值

Callable和Runnable接口的对比
1.Callable有返回值
2.Callable可以抛出异常，外界可获取异常的信息
3.Callable支持泛型
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class NumSum implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for(int i = 1; i <= 100; i ++) {
            System.out.println(i);
            sum += i;
        }
        return sum;
    }
}

public class NewThread01 {
    public static void main(String[] args) {
        NumSum n = new NumSum();


        FutureTask f = new FutureTask(n);
        new Thread(f).start();
        try {
            System.out.println(f.get());//get()方法
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
