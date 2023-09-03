<%@page contentType="text/html;charset=utf-8" %>
<jsp:useBean id="count" scope="application" class="bean.CounterBean" />
<html>
  <head>
    <title>カウンター</title>
  </head>
  <body>
    <h2>
      <jsp:getProperty name="count" property="count" />回目のアクセスです
    </h2>
  </body>
</html>