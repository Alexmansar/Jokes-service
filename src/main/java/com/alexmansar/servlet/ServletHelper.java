package com.alexmansar.servlet;

import com.alexmansar.controller.Controller;
import com.alexmansar.repository.ModelRepository;
import com.alexmansar.service.ModelServiceImpl;

public interface ServletHelper {
    default Controller getController() {
        return new Controller(new ModelServiceImpl(new ModelRepository()));
    }
}