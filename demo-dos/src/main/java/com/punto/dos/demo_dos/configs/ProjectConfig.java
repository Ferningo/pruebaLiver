package com.punto.dos.demo_dos.configs;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.punto.dos.demo_dos.proxy")
public class ProjectConfig {
}
