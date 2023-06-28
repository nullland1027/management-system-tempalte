package servlet;

import dao.CustomerDAO;


import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import domain.*;
public class MaleServelet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CustomerDAO cDAO = new CustomerDAO();
        List<Customer> customers = cDAO.getCustomerByGender("Male");
        request.setAttribute("customers", customers);
        request.getRequestDispatcher("/male.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
