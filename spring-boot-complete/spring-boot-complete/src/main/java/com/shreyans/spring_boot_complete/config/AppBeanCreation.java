package com.shreyans.spring_boot_complete.config;

import com.shreyans.spring_boot_complete.model.MyClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppBeanCreation {

    @Bean
    MyClass privateMyClass() {
     return new MyClass(1);
    }

    @Bean("CustomName")
    MyClass customNameMyClass() {
        return new MyClass(2);
    }
}
