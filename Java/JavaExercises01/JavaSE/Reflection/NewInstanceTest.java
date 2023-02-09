package Reflection;

import org.junit.Test;

import java.util.Random;

/*
* 通过反射创建运行时类的对象
* */
public class NewInstanceTest {
    @Test
    public void test1() throws Exception {
        Class<Person> clazz = Person.class;
        //newInstance() 创建运行时类的对象
        //内部调用了运行时类的空参构造器
        Person obj = clazz.newInstance();
        System.out.println(obj);
    }

    @Test
    public void RandomReflection() {
        int i = new Random().nextInt(3);
        String path = "";
        switch(i) {
            case 0:
                path = "java.sql.Date";
                break;
            case 1:
                path = "java.util.Date";
                break;
            case 2:
                path = "Reflection.Person";
                break;
        }
        try {
            Object obj = getInstance(path);
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getInstance(String path) throws Exception {
        Class aClass = Class.forName(path);
        return aClass.newInstance();
    }
}
