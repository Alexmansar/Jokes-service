package com.alexmansar.servlet;


import com.alexmansar.controller.Controller;
import com.alexmansar.model.Model;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class GetAllServlet extends HttpServlet implements ServletHelper {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Controller controller = getController();
        List<Model> models = controller.gelAllModel();
        request.setAttribute("models", models);
        getServletContext().getRequestDispatcher("/allJokes.jsp").forward(request, response);
    }
}