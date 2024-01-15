package seqqal.abdelaziz.gestionprojects.servlets;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "TeamMemberServlet", urlPatterns = {"/TeamMemberServlet"})
public class TeamMemberServlet extends HttpServlet {
    public TeamMemberServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("Hello, TeamMemberServlet - This is the doGet method!");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("Hello, TeamMemberServlet - This is the doPost method!");
    }
}
