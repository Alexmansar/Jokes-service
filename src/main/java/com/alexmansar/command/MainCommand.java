package com.alexmansar.command;

import com.alexmansar.model.Model;
import com.alexmansar.service.ServiceFactory;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;
import java.util.Random;

public class MainCommand implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        Random random = new Random();
        List<Model> models = ServiceFactory.getModel().getAllModel();
        int rando = random.nextInt(models.size());
        Model model = models.get(rando);
        request.setAttribute("name", model);
        return "random.jsp";
    }
}
