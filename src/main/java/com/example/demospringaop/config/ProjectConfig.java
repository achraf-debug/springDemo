package com.example.demospringaop.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demospringaop.services")
public class ProjectConfig {

}
