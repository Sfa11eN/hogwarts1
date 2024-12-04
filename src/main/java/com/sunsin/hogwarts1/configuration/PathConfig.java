package com.sunsin.hogwarts1.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PathConfig {

    @Value("${avatars.path}")
    private String path;

    @Bean(name = "avatarPath")
    String avatarPath() {
        return path;
    }

}
