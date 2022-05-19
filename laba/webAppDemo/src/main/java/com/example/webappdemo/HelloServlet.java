package com.example.webappdemo;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        Cart cart = (Cart) session.getAttribute("cart");

        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        if (cart == null) {
            cart = new Cart();

            cart.setName(name);
            cart.setQuantity(quantity);
        }

        session.setAttribute("cart", cart);
        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);
//        String name = request.getParameter("name");


//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1> Your count is: " + message + "</h1>");
//   //     out.println("<h1> HELLO, " + name + "</h1>");
//        out.println("</body></html>");

        //redirect
//        response.sendRedirect("http://localhost:8080/webAppDemo_war_exploded/hello-jsp");
    }

    public void destroy() {
    }
}