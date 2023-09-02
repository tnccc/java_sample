<%@page contentType="text/html;charset=utf-8" %>
<%!
  String fortune() {
    String result;
    double random = Math.random();

    if(random >= 0.7) {
      result = "大吉";
    } else if(random >= 0.4) {
      result = "中吉";
    } else if(random >= 0.1) {
      result = "小吉";
    } else {
      result = "凶";
    }
    return result;
  }
%>
<html>
  <head>
    <title>占いJSP</title>
  </head>
  <body>
    <div>今日の運勢は</div>
    <div>あなたの今日の運勢と明日の運勢は・・・</div>
    <% for(int i = 0; i < 2; i++) { %>
      <div><%= fortune() %></div>
    <% } %>
  </body>
</html>