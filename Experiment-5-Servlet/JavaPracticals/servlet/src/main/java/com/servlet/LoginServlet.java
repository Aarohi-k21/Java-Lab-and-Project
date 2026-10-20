
package com.servlet;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "1234".equals(password)) {

            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            response.getWriter().println(
                "<h1>Login Successful!</h1>" +
                "<p>Welcome, " + username + ".</p>" +
                "<a href='home'>Go to Home</a>"
            );

        } else {
            response.getWriter().println(
                "<h1>Invalid Login</h1>" +
                "<p>Please go back and check your credentials.</p>" +
                "<a href='index.html'>Try Again</a>"
            );
        }
    }
}
