package com.ninos.thirdcontext;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ninos.thirdcontext")
@EnableAutoConfiguration
public class ThirdContextConfig {
}
