package com.alexmansar.command;

import com.alexmansar.repository.JokeRepository;
import com.alexmansar.service.JokeService;
import com.alexmansar.service.JokeServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CommandFactoryTest {
    JokeService service;
    JokeRepository jokeRepository;
    CommandFactory commandFactory;

    @BeforeEach
    public void initCommandFactory() {
        commandFactory = CommandFactory.getCommandFactory();
        jokeRepository = new JokeRepository();
        service = new JokeServiceImpl(jokeRepository);
    }

    @AfterEach
    public void destroyCommandFactory() {
        commandFactory = null;
        jokeRepository = null;
        service = null;
    }

    @Test
    public void createCommandFactoryTest() {
        Assertions.assertNotNull(commandFactory);
    }

    @Test
    public void allJokesCommandTest() {
        Command command = commandFactory.getCommand("all");
        Command allJokes = new GetAllJokesCommand(service);
        assertEquals(command.getClass(), allJokes.getClass());
    }
    @Test
    public void randomJokeCommandTest() {
        Command command = commandFactory.getCommand("random");
        Command allJokes = new GetRandomJokeCommand(service);
        assertEquals(command.getClass(), allJokes.getClass());
    }

    @Test
    public void wrongCommandTest() {
        Command command = commandFactory.getCommand("randdfom");
        assertNull(command);
    }
}