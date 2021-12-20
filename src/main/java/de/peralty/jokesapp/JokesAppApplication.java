package de.peralty.jokesapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class JokesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokesAppApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//    }
}
