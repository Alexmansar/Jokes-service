package com.alexmansar.servlet;

import com.alexmansar.command.Command;
import com.alexmansar.command.CommandFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CommandFactory factory = CommandFactory.commandFactory();
        Command command = factory.getCommand(req);
        String page = command.execute(req);
        req.getRequestDispatcher(page).forward(req, resp);
    }


}
