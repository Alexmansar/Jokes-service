package com.alexmansar.command;

import com.alexmansar.repository.JokeRepository;
import com.alexmansar.service.JokeService;
import com.alexmansar.service.JokeServiceImpl;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommandFactory {

    static CommandFactory factory = new CommandFactory();
    final Map<String, Command> commandMap = new HashMap<>();

    public static CommandFactory getCommandFactory() {
        if (factory == null) {
            factory = new CommandFactory();
            log.info("new factory was created {}", factory);
        }
        return factory;
    }

    private CommandFactory() {
        JokeService service = new JokeServiceImpl(new JokeRepository());
        commandMap.put("all", new GetAllJokesCommand(service));
        commandMap.put("random", new GetRandomJokeCommand(service));
    }

    public Command getCommand(String action) {
        return commandMap.get(action);
    }
}
