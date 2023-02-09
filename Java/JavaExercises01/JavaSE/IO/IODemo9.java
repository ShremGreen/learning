package IO;

import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
随机存取文件流
可实现文件的存和取

 */
public class IODemo9 {
    //用RandomAccessFile实现图片的复制
    @Test
    public void test1() {
        RandomAccessFile raf1 = null;//r  rw  rwd  rws
        RandomAccessFile raf2 = null;
        try {
            //实例化随机存取文件流
            raf1 = new RandomAccessFile("憨狗","r");
            raf2 = new RandomAccessFile("憨狗4","rw");

            //实现复制粘贴
            byte[] buf = new byte[20];
            int len;
            while((len = raf1.read(buf)) != -1) {
                raf2.write(buf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if(raf1 != null) {
                    raf1.close();
                }
                if(raf2 != null) {
                    raf2.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //操作txt
    @Test
    public void test2() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hello.txt","rw");
        raf1.write("CCC".getBytes());//将字符串转化为字节数组


        raf1.seek(6);//将指针指向角标为7的位置
        raf1.seek(raf1.length());//指针到末尾
        raf1.write("HaHa".getBytes());
        raf1.close();//CCCJava123456HaHa
    }
}
