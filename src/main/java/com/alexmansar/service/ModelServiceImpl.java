package com.alexmansar.service;


import com.alexmansar.model.Model;
import com.alexmansar.repository.ModelRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ModelServiceImpl implements ModelService {
    ModelRepository modelRepository;

    @Override
    public List<Model> getAllModel() {
        return modelRepository.getActorList();
    }

}
