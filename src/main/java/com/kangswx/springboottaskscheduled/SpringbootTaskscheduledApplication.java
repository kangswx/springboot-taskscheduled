package com.kangswx.springboottaskscheduled;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
@MapperScan(basePackages ="com.kangswx.springboottaskscheduled.mapper")
public class SpringbootTaskscheduledApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTaskscheduledApplication.class, args);
    }

}
