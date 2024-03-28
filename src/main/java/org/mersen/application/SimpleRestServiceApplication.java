package org.mersen.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.mersen")
public class SimpleRestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleRestServiceApplication.class, args);
    }

}
