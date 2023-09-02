import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class SessionServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException {
      res.setContentType("text/html;charset=utf-8");
      PrintWriter out = res.PrintWriter();
      out.println("<html>");
      out.println("<head>");

      out.println("</head>");
      out.println("<body>");
        out.println("<h2>商品を選択してください</h2");
      out.println("</body>");
      out.println("</html>");
    }
}
