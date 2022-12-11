package com.alexmansar.servlet;

import java.io.*;


import com.alexmansar.controller.Controller;
import com.alexmansar.model.Model;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class HelloServlet extends HttpServlet implements ServletHelper{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Controller controller = getController();
        Model model = controller.getModel();
        request.setAttribute("name", model);
        getServletContext().getRequestDispatcher("/first.jsp").forward(request, response);
    }

}