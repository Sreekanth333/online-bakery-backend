package com.chezuba.onlinebakerybackend;

import com.chezuba.onlinebakerybackend.service.DataInitializerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private DataInitializerService dataInitializerService;

    @Override
    public void run(String... args) {
        dataInitializerService.initializeData();
    }
}

