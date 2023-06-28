package servlet;

import domain.User;
import dao.*;
import tool.Tools;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("user_name");
        String pwd = request.getParameter("pwd");
        UserDAO dao = new UserDAO();
        List<User> users = dao.getUser();
        int i = 0;
        while (i < users.size()) {
            if (users.get(i).getUserName().equals(name) && users.get(i).getPwd().equals(pwd)) {
                response.sendRedirect("go.do");
            } else {
                i += 1;
            }
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
