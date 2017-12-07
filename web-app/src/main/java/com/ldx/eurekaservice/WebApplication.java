package com.ldx.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
//@EnableDiscoveryClient
@EnableEurekaServer
//@EnableFeignClients
//@ConditionalOnClass({ VelocityEngine.class, VelocityEngineFactory.class })
//@EnableAsync
//@ImportResource({"classpath*:spring-all.xml"})
public class WebApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
