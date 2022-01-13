package com.easonwy.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author eason.wu
 * @date 2022/1/13 09:55
 **/
@SpringBootApplication
public class SpringbootHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloWorldApplication.class);

        System.out.println("Hello World!");
    }
}
