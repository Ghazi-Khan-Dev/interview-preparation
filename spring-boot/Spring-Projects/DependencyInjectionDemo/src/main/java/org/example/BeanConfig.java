package org.example;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = "org.example")
public class BeanConfig {

//    @Bean
//    public Principal principal() {
//        return new Principal();
//    }
}
