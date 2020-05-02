package com.automannn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author automannn@163.com
 * @time 2020/5/2 14:22
 */

@SpringBootApplication
@EnableEurekaServer
public class AutomannnRegisterCenter {

    public static void main(String[] args) {
        SpringApplication.run(AutomannnRegisterCenter.class);
    }
}
