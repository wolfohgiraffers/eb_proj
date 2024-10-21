package com.ohgiraffers.eb_proj;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/*
    <Dependencies>
    1. Spring Web
    2. Spring Boot DevTools
    3. Lombok
    4. Spring Data JPA
    5. MariaDB Driver
    6. modelmapper는 이후에 수동 추가
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
