package servlet;

import dao.CustomerDAO;


import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import domain.*;
public class FemaleServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CustomerDAO cDAO = new CustomerDAO();
        List<Customer> customers = cDAO.getCustomerByGender("Female");
        request.setAttribute("customers", customers);
        request.getRequestDispatcher("/female.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
