<%--
  Created by IntelliJ IDEA.
  User: jianfengweng
  Date: 2018/2/22
  Time: 下午8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>用户登录</h1>
  <form action="/LoginCL" method="post">
    账号<input type="text" name="account"/>
    <br>
    密码<input type="text" name="password"/>
    <br>
    <input type="submit" value="提交">
  </form>
  </body>
</html>
