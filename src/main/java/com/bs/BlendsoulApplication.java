package com.bs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//mybatis扫描dao层
@MapperScan("com.bs.dao")
public class BlendsoulApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlendsoulApplication.class, args);
    }

}
