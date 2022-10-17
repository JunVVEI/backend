package com.sfb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description SpringBootApplication
 * @Author JunWEI
 * @Date 2022/10/18
 */
@SpringBootApplication
public class BKDApplication {
    public static void main(String[] args) {
        SpringApplication.run(BKDApplication.class, args);
        System.out.println("启动成功");
    }
}
