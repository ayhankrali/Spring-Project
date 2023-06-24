package com.example.spring.demo;

import com.example.spring.repository.UserRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBaseInitializer implements CommandLineRunner {


    @Autowired
    private final UserRepository userRepository;
    public DataBaseInitializer(UserRepository userRepository) {
        this.userRepository = userRepository;

    }


    @Override
    public void run(String... args) throws Exception {
        User user = User.builder()

                .id(3553535L)
                .email("ayhan@gmail.com")
                .firstName("Ayhan")
                .lastName("Krala")
                .build();

        userRepository.save(user);

    }
}
