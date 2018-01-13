import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HelloServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response){

        try {
//            response.getWriter().println("<h1>Hello Servlet!</h1>");
//            response.getWriter().println(new Date());
            PrintWriter out = response.getWriter();
            out.println("<h1>Hello Servlet!</h1>");
            out.println(new Date());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
