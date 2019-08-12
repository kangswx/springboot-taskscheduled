package com.kangswx.springboottaskscheduled;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling    //定时任务注解
@EnableAsync         //异步任务注解
@MapperScan(basePackages ="com.kangswx.springboottaskscheduled.mapper")  //Mybatis的Mapper接口扫描注解
public class SpringbootTaskscheduledApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTaskscheduledApplication.class, args);
    }

}
