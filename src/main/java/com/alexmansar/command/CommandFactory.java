package com.alexmansar.command;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.HashMap;
import java.util.Map;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommandFactory {

    static CommandFactory factory = new CommandFactory();
    final Map<String, Command> commandMap = new HashMap<>();

    CommandFactory() {
    }

    public static CommandFactory commandFactory() {
        if (factory == null) {
            factory = new CommandFactory();
        }
        return factory;
    }

    {
        commandMap.put("all", new GetAllCommand());
        commandMap.put("random", new MainCommand());
    }

    public Command getCommand(HttpServletRequest request) {
        String action = request.getParameter("action");
        return commandMap.get(action);
    }
}
