package com.alexmansar.servlet;

import com.alexmansar.command.Command;
import com.alexmansar.command.CommandFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
@Slf4j
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CommandFactory factory = CommandFactory.getCommandFactory();
        String action = req.getParameter("action");
        Command command = factory.getCommand(action);
        log.info("action {}", action);
        String page = command.execute(req);
        log.info("page {}", page);
        req.getRequestDispatcher(page).forward(req, resp);
    }
}