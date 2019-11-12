package web.servlet;

import entity.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private UserService userService = new UserService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //从前端获取用户名密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //调用业务层获取loginUser
        User loginUser = userService.findByUser(username, password);
        if (loginUser!=null){
            String remember = request.getParameter("remember");
            if (remember!=null){
                //创建一个cookie用来存储用户名
                Cookie usernameCookie = new Cookie("username", username);
                usernameCookie.setPath(request.getContextPath()+"/login.html");
                usernameCookie.setMaxAge(60*60*24*7);
                response.addCookie(usernameCookie);
                //创建一个cookie用来存储用户密码
                Cookie passwordCookie = new Cookie("password", password);
                passwordCookie.setPath(request.getContextPath()+"/login.html");
                passwordCookie.setMaxAge(60*60*24*7);
                response.addCookie(passwordCookie);
            }
            response.sendRedirect(request.getContextPath()+"/success.html");
        }else {
            response.sendRedirect(request.getContextPath()+"/error.html");
        }

    }
}
