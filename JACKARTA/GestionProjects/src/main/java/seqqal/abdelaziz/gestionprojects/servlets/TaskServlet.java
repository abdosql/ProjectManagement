package seqqal.abdelaziz.gestionprojects.servlets;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "TaskServlet", urlPatterns = {"/TaskServlet"})
public class TaskServlet extends HttpServlet {
    public TaskServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("Hello, TaskServlet - This is the doGet method!");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("Hello, TaskServlet - This is the doPost method!");
    }
}
