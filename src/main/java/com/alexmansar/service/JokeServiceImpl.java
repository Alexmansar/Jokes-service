package com.alexmansar.service;


import com.alexmansar.model.Joke;
import com.alexmansar.repository.JokeRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class JokeServiceImpl implements JokeService {
    JokeRepository jokeRepository;
    @Override
    public List<Joke> getAllJokes() {
        return jokeRepository.getJokesList();
    }
}