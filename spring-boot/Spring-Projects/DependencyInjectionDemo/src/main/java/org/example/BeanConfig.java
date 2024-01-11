package org.example;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class BeanConfig {

    @Bean
    public Principal principal() {
        return new Principal();
    }
}
