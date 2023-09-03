<%@page contentType="text/html;charset=utf-8" %>
<% request.setCharacterEncoding("utf-8") %>;

<html>
  <head><title>確認画面</title>
  </head>
  <body>
    <h2>入力情報を確認して登録ボタンを押してください</h2>
    <div>
      <span>名前:</span>
      <span><%= request.getParameter("name") %></span>
    </div>
    <div>
      <span>パスワード:</span>
      <span><%= request.getParameter("pass") %></span>
    </div>
    <div>
      <%
        String age = request.getParameter("age");
        if(age.equals("child")) {
          age = "18歳未満";
        } else {
          age = "18歳以上";
        }
      %>
    </div>
    <div>
      <span>年齢:</span>
      <span><%= age %></span>
    </div>
    <div>
      <%
        String[] languageList = request.getValues("lang");
        for(lang: languageList) {
          out.println(lang);
        }
      %>
    </div>
    <div>
      <span>住所:</span>
      <span><%= request.getParameter("address") %></span>
    </div>
    <div>
      <span>ご意見:</span>
      <span><%= request.getParameter("msg") %></span>
    </div>
    <input type="submit" value="登録" />　
    <input type="reset" value="戻る" />
  </body>
</html>