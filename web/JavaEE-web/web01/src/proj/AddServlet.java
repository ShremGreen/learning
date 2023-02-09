package proj;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    /**
     * 响应post请求
     * @param req 请求，客户端像服务器端发送的信息被封装为Request
     * @param resp 响应
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //post方式下需要设定编码，防止中文乱码
        //get方式下不需要设置
        req.setCharacterEncoding("UTF-8");
        String fruit = req.getParameter("fruit");
        String p = req.getParameter("price");
        Integer price = Integer.parseInt(p);
        String c = req.getParameter("count");
        Integer count = Integer.parseInt(c);
        String remark = req.getParameter("remark");
        System.out.println(fruit + '\n' + price + '\n' + count + '\n' + remark);
    }
}
