package pl.coderslab.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet (urlPatterns = "/get1")
public class Get1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int start = Integer.parseInt(req.getParameter("start"));
            int stop = Integer.parseInt(req.getParameter("stop"));

            for (int i = start; i <= stop; i++) {
                resp.getWriter().append(i + " ");
            }
            resp.getWriter().close();
        } catch (NumberFormatException e) {
            resp.getWriter().append("BRAK");
            resp.getWriter().close();
        }
    }
}
