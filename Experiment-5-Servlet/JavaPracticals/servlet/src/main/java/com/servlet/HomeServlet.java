
package com.servlet;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        HttpSession session = request.getSession(false);

        if (session == null ||
            session.getAttribute("username") == null) {
            response.sendRedirect("index.html");
            return;
        }

        String username =
            (String) session.getAttribute("username");

        response.getWriter().println(
            "<h1>Student Home</h1>" +
            "<h2>Welcome " + username + "</h2>" +
            "<p>You are logged in successfully.</p>" +
            "<a href='logout'>Logout</a>"
        );
    }
}
