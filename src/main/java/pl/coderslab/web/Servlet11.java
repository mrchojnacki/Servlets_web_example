package pl.coderslab.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.IOException;


@WebServlet(urlPatterns = "/servlet11")
public class Servlet11 extends HttpServlet {
    private static final Logger logger = LogManager.getLogger(Servlet11.class);
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("<h1>Hello first servlet.</h1>");
        response.getWriter().append("<p>Content11</p>");
    }
}
