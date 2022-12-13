package com.alexmansar.command;

import com.alexmansar.model.Joke;
import com.alexmansar.service.JokeService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Random;

@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class GetRandomJokeCommand implements Command {
    JokeService service;

    @Override
    public String execute(HttpServletRequest request) {
        Random random = new Random();
        List<Joke> jokes = service.getAllJokes();
        int rando = random.nextInt(jokes.size());
        Joke joke = jokes.get(rando);
        String jokeString = " " + joke.getSetup() + " " + joke.getPunchline();
        request.setAttribute("name", jokeString);
        log.info("joke with id {} was create by random value {}, joke {}", joke.getId(), rando, jokeString);
        return "random.jsp";
    }
}
