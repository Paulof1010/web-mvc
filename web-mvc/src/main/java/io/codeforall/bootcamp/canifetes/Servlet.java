package io.codeforall.bootcamp.canifetes;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Servlet extends HttpServlet {

    public static class Canifete {

        int id;
        String name;
        String email;
        int phone;

        public Canifete(int id, String name, String email, int phone) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.phone = phone;
        }
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Canifete canifete = new Canifete(1, "Paulo Ferreira", "paulof@codeforall.pt", 123456789);

        req.setAttribute("id", canifete.id);
        req.setAttribute("name", canifete.name);
        req.setAttribute("email", canifete.email);
        req.setAttribute("phone", canifete.phone);

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
        requestDispatcher.forward(req, resp);
    }
}
