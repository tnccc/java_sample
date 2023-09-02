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
      PrintWriter out = res.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("<title>確認画面</title>");
      out.println("</head>");
      out.println("<body>");
        out.println("<h2>入力情報を確認して登録ボタンを押してください</h2>");
        out.println("氏名: <strong>" + req.getParameter("name") + "</strong><br />");
        out.println("パスワード: <strong>" + req.getParameter
        ("pass") + "</strong><br />");
        String age = req.getParameter("age");
        if(age.equals("child")) {
          age = "18歳未満";
        } else {
          age = "18歳以上";
        }
        out.println("年齢: <strong>" + age + "</strong><br /><br />");
        String[] langs = req.getParameterValues("lang");
        out.println("開発経験: <strong>");
        for(String lang: langs) {
          out.println( lang + "<strong/>");
        }
      out.println("</body>");
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
        doPost(req, res);
      }
}
