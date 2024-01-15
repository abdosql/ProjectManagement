package seqqal.abdelaziz.gestionprojects.servlets;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "ProjectServlet", urlPatterns = {"/ProjectServlet"})
public class ProjectServlet extends HttpServlet {
    public ProjectServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("Hello, ProjectServlet - This is the doGet method!");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("Hello, ProjectServlet - This is the doPost method!");
    }
}
