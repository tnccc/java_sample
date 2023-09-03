import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException {
      req.setCharacterEncoding("utf-8");
      res.setContentType("text/html;charset=utf-8");
      String age = req.getParameter("age");
      if(age.equals("child")) {
        age = "18歳未満";
      } else {
        age = "18歳以上";
      }
      req.setAttribute("age", age);
      String langs = "";
      String[] lang = req.getParameterValues("lang");
      for(int i = 0; i < lang.length; i++) {
        langs = langs + lang[i] + "";
      }
      req.setAttribute("langs", langs);
      RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
      rd.forward(req, res);

    public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
        doPost(req, res);
      }
}
