package com.alexmansar.service;


import com.alexmansar.repository.ModelRepository;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class ServiceFactory {

    private static ModelService createModelService() {
        return new ModelServiceImpl(new ModelRepository());
    }

    public static ModelService getModel() {
        return createModelService();
    }
}
