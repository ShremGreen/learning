import org.junit.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
Statement
*/

public class statements {
    @Test
    public void testDML() throws Exception {
        //1. 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2. 获取连接：如果连接的是本机mysql并且端口是默认的 3306 可以简化书写
        String url = "jdbc:mysql://127.0.0.1:3306/mydatabase";
        String username = "root";
        String password = "951esz753";
        Connection conn = DriverManager.getConnection(url, username, password);
        //3. 定义sql
        String sql = "update bank set money = 3000 where id = 1";
        //4. 获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();
        //5. 执行sql
        int count = stmt.executeUpdate(sql);//执行完DML语句，受影响的行数
        //6. 处理结果
        //System.out.println(count);
        if(count > 0){
            System.out.println("修改成功~");
        }else{
            System.out.println("修改失败~");
        }
        //7. 释放资源
        stmt.close();
        conn.close();
    }
}
