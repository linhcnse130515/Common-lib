package org.example;

import org.example.interceptor.JwtInterceptor;
import org.example.security.JWTAuthenticationVerificationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CustomWebConfigurer implements WebMvcConfigurer {
    @Autowired
    private JwtInterceptor jwtInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(jwtInterceptor);
    }

    @Bean
    public JWTAuthenticationVerificationFilter jwtAuthenticationVerficationFilter() {
        return new JWTAuthenticationVerificationFilter();
    }

}
