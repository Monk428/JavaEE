package controller;

import java.io.IOException;
import java.sql.SQLException;

import model.User;

@javax.servlet.annotation.WebServlet(name = "LoginCLServlet")
public class LoginCLServlet extends javax.servlet.http.HttpServlet {

    private static final long serialVersionUID = 1L;

    public LoginCLServlet() {
        super();
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request,
                          javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request,
                         javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        System.out.println("接收到数据");
        //接收用户提交的用户名和密码
        String account = request.getParameter("account");
        String password = request.getParameter("password");

        //创建用户
        User user = new User(account, password);

        try {
            if (user.isExist()) {
                response.sendRedirect("/Welcome");
            } else {
                response.sendRedirect("/Error");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
