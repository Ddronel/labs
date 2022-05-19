package com.example.webappdemo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class DeleteCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie deleteCookie = new Cookie("some_id", "");

        deleteCookie.setMaxAge(0);

        response.addCookie(deleteCookie);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
