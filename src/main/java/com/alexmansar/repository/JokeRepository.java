package com.alexmansar.repository;

import com.alexmansar.model.Joke;
import com.alexmansar.util.SessionUtil;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class JokeRepository extends SessionUtil {

    public List<Joke> getJokesList() {
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Joke> cq = cb.createQuery(Joke.class);
        Root<Joke> root = cq.from(Joke.class);
        CriteriaQuery<Joke> allJoke = cq.select(root);
        TypedQuery<Joke> allQuery = session.createQuery(allJoke);
        return allQuery.getResultList();
    }
}
