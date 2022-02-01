//ENTITY

package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class config {

    @Bean
    CommandLineRunner commandLineRunner(studentRepo Repo) {
        return args -> {
                Student Gabboo = new Student("Gabboo","DS@gmail.com","1234567890");
            Student Gabboo2 = new Student("Gabboo2","DS@gmail.com","1234567890");
        Repo.saveAll(List.of(Gabboo, Gabboo2));
        };
    }
}




