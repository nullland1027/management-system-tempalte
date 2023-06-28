package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDAO;
import domain.Customer;
import tool.Tools;

public class DoAddServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String rName = request.getParameter("cname");
        String name = Tools.transCoding(rName, "UTF-8");
        String rGender = request.getParameter("gender");
        String gender = Tools.transCoding(rGender, "UTF-8");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String description = request.getParameter("description");

        Customer customer = new Customer();
        customer.setName(name);
        customer.setGender(gender);
        customer.setPhone(phone);
        customer.setEmail(email);
        customer.setDescription(description);
        CustomerDAO dao = new CustomerDAO();
        dao.addCustomer(customer);
        response.sendRedirect("list.do");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
