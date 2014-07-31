package com.thoughtworks.bookshelf.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
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
}
