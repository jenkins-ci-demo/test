package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hello extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
    PrintWriter out;

    res.setContentType("text/html; charset=utf-8");
    out = res.getWriter();

    out.println("<html><body>");
    out.println("<h1>Hello World! Jenkins build success!!</h1>");
    out.println("</body></html>");
  }
}