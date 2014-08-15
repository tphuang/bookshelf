package com.thoughtworks.bookshelf.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<head>");
        out.println("<title>Hello Tingpeng!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello Tingpeng!</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("init HelloServlet");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("destroy HelloServlet");
    }
}
