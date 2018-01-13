import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HelloServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {


        PrintWriter out = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("驱动初始化成功");
            out = response.getWriter();
            out.println("<h1>Hello Servlet!</h1>");
            out.println(new Date());
        } catch (IOException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
