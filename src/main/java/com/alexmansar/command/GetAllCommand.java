package com.alexmansar.command;

import com.alexmansar.model.Model;
import com.alexmansar.service.ServiceFactory;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

public class GetAllCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        List<Model> models = ServiceFactory.getModel().getAllModel();
        request.setAttribute("models", models);
        return "allJokes.jsp";
    }
}
