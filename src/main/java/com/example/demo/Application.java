package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
//        return args -> {
//            Student amonjot = new Student(
//                    "Amonjot",
//                    "Chhina",
//                    "chhinajot@gmail.com",
//                    26);
//            studentRepository.save(amonjot);
//            Student manu = new Student(
//                    "Manu",
//                    "Simriti",
//                    "manu@gmail.com",
//                    25);
//            studentRepository.save(manu);
//        };
//
//    }

}
