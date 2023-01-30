package com.vishwas.Customer.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfiguration {

    @Bean
    public RestTemplate getRestTemplate(PropertyConfiguration propertyConfiguration) {
        return new RestTemplateBuilder().rootUri(propertyConfiguration.getLocation()).build();
    }

    @Bean
    public ObjectMapper getMapper() {
        return new ObjectMapper();
    }
}
