package JavaSE.Exception;

import java.io.IOException;

public class ExceptionDemo06 {
    public static void main(String[] args) {

        ExceptionDemo06 e = new ExceptionDemo06();
        e.show(new Son());//这是子类method
    }
    public void show(Father f) {
        try {
            f.method();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
class Father {
    public void method() throws Exception{
        System.out.println("这是父类method");
    }
}
class Son extends Father {
    @Override
    public void method() throws RuntimeException {
        int x = 0;
        int y = 3;
        System.out.println(y/x);
        System.out.println("这是子类method");
    }
}
