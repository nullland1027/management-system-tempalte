package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDAO;
import domain.Customer;
import tool.*;
public class DoSearchServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String rSearch = request.getParameter("search");
        String search = Tools.transCoding(rSearch, "UTF-8");

        CustomerDAO dao = new CustomerDAO();
        Customer customer = dao.getCustomerByName(search);
        if (customer != null) {
            request.setAttribute("customer", customer);
            request.getRequestDispatcher("/view.jsp").forward(request, response);
        } else {
            customer.setId(0);
            customer.setName("查无此人");
            customer.setGender("查无此人");
            customer.setPhone("查无此人");
            customer.setEmail("查无此人");
            customer.setDescription("查无此人");
            request.setAttribute("customer", customer);
            request.getRequestDispatcher("/view.jsp").forward(request, response);
        }

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
