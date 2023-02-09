package Reflection;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderTest {
    @Test
    public void test1() throws IOException {
        Properties prop = new Properties();
        //读取配置文件：IO流
//        FileInputStream fis = new FileInputStream("proTest.properties");
//        prop.load(fis);
        //读取文件配置：类加载器
        InputStream ras = ClassLoaderTest.class.getResourceAsStream("proTest01.properties");
        prop.load(ras);

        String user = prop.getProperty("user");
        String password = prop.getProperty("password");
        System.out.println(user);
        System.out.println(password);
    }
}
