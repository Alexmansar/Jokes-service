package com.alexmansar.controller;

import com.alexmansar.model.Model;
import com.alexmansar.service.ModelService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Random;
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class Controller {
    ModelService service;

    public List<Model> gelAllModel() {
        return service.getAllModel();
    }

    public Model getModel() {
        Random random = new Random();
        List<Model> models = gelAllModel();
        int rando = random.nextInt(models.size());
        return models.get(rando);
    }
}
