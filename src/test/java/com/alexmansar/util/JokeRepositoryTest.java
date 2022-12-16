package com.alexmansar.util;


import com.alexmansar.model.Joke;
import com.alexmansar.repository.JokeRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class JokeRepositoryTest extends SessionUtilTest {

    JokeRepository jokeRepository;

    @BeforeEach
    public void initJokeRepository() {
        jokeRepository = new JokeRepository();
    }

    @AfterEach
    public void destroyJokeRepository() {
        jokeRepository = null;
    }


    @Test
    public void jokesListNotNullTest() {
        List<Joke> jokes = jokeRepository.getJokesList();
        Assertions.assertNotNull(jokes);
    }

    @Test
    public void jokesListAsArrayTest() {
        List<Joke> jokes = jokeRepository.getJokesList();
        Assertions.assertSame(jokes.getClass(), ArrayList.class);
    }

    @Test
    public void objectAsJokeTest() {
        List<Joke> jokes = jokeRepository.getJokesList();
        Object o=jokes.get(0);
        Assertions.assertSame(o.getClass(), Joke.class);
    }
}