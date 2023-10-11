package com.example.lab3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.example.lab3.classes")
@EnableAspectJAutoProxy

public class Springconfig {

}
