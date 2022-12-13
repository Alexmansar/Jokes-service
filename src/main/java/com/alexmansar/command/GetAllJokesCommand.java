package com.alexmansar.command;

import com.alexmansar.model.Joke;
import com.alexmansar.service.JokeService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class GetAllJokesCommand implements Command {
    JokeService service;

    @Override
    public String execute(HttpServletRequest request) {
        List<Joke> jokes = service.getAllJokes();
        request.setAttribute("jokes", jokes);
        log.info("size jokes list {}", jokes.size());
        return "allJokes.jsp";
    }
}