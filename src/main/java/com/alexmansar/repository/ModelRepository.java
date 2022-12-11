package com.alexmansar.repository;

import com.alexmansar.model.Model;
import com.alexmansar.util.SessionUtil;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ModelRepository extends SessionUtil {

    public List<Model> getActorList() {
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Model> cq = cb.createQuery(Model.class);
        Root<Model> rootEntry = cq.from(Model.class);
        CriteriaQuery<Model> all = cq.select(rootEntry);
        TypedQuery<Model> allQuery = session.createQuery(all);
        return allQuery.getResultList();
    }
}
