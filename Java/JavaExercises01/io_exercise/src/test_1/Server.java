package test_1;

//客户端发送消息，服务器端接收消息

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        try {
            //定义一个ServiceSocket对象进行服务器端口注册
            ServerSocket ss = new ServerSocket(9999);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
