package com.springcourse.springcoredemo.config;

import com.springcourse.springcoredemo.common.Coach;
import com.springcourse.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
