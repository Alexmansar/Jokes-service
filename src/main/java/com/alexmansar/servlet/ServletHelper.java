package com.alexmansar.servlet;

import com.alexmansar.controller.Controller;
import com.alexmansar.repository.ModelRepository;
import com.alexmansar.service.ModelServiceImpl;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class ServletHelper {

    public static Controller getController() {
        return new Controller(new ModelServiceImpl(new ModelRepository()));
    }
}
