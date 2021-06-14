package com.example.demo3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    /**
     *adds students to database
     */
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student josef = new Student(
                    "Josef",
                    "Fryc",
                    21,
                    "josef.fryc@gmail.com"
            );

            Student veronika = new Student(
                    "Veronika",
                    "Endrstova",
                    22,
                    "veronika.endrstova@gmail.com"
            );
            Student barbora = new Student(
                    "Barbora",
                    "Havrankova",
                    21,
                    "barbora.havrankova@gmail.com"
            );Student matej = new Student(
                    "Matej",
                    "Novak",
                    24,
                    "matej.novak@gmail.com"
            );

            repository.saveAll(List.of(josef, veronika, barbora, matej));
        };
    }
}
