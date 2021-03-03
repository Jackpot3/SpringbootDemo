package com.home.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author JACKPOT
 */
@Configuration
public class SpringMvcConfig {

    @Bean
    ViewResolver getViewResolver(){
        return new InternalResourceViewResolver();
    }
}
