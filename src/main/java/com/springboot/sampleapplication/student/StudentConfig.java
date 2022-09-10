package com.springboot.sampleapplication.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student ashish = new Student(
                    "Ashish",
                    "ashish@gmail.com",
                    LocalDate.of(1998, MAY, 21)
            );

            Student abhishek = new Student(
                    "Abhishek",
                    "abhishek@gmail.com",
                    LocalDate.of(1997, JUNE, 11)
            );

            repository.saveAll(
                    List.of(ashish,abhishek)
            );
        };
    }
}
