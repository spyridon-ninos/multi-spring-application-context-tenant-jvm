package com.ninos.secondcontext;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ninos.secondcontext")
@EnableAutoConfiguration
public class SecondContextConfig {
}
